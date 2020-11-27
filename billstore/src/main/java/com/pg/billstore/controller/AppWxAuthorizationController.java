package com.pg.billstore.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.pg.billstore.entity.Appwxuser;
import com.pg.billstore.handler.BusinessStatus;
import com.pg.billstore.handler.Result;
import com.pg.billstore.service.AppwxuserService;
import com.pg.billstore.util.HttpUrlUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "微信登录")
@RequestMapping("/api/wx")
@RestController
public class AppWxAuthorizationController {
    private static Logger log = LoggerFactory.getLogger(AppuserController.class);

    @Autowired
    private AppwxuserService appwxuserService;

    /**
     * 1、第一次进来先查询一下有没有openid
     * 2、没有新增一条，并返回userId
     * 3、否则返回userId
     */
    @ApiOperation("微信登录并查看权限")
    @GetMapping(value = "/login")
    public Result<Appwxuser> Login(
            @RequestParam("code") String code,
            @RequestParam("nickName") String nickName,
            @RequestParam("avatarUrl") String avatarUrl,
            @RequestParam("gender") Integer gender
    ) {
        String Appid = "wx886ac99b96a07e94";
        String Secret = "ad5aec7c6994aa92af0e882244fd92b7";
        String Url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=" + Appid + "&secret=" + Secret + "&code=" + code + "&grant_type=authorization_code";
        JSONObject object = (JSONObject) JSON.parse(HttpUrlUtil.httpURLConectionGET(Url));
        if (object.get("openid") == null) {
            log.info("返回的结果={}", JSON.toJSONString(object));
        }
        String openid = (String) object.get("openid");
        Integer count = this.appwxuserService.queryOneOpenId(openid);
        if (count == 0) {
            Appwxuser wxInfo = this.saveWxInfo(nickName, gender, avatarUrl, openid);
            return new Result<Appwxuser>(BusinessStatus.SUCCESS_GET, wxInfo);
        } else {
            Appwxuser wxInfo = this.getWxInfo(openid);
            return new Result<Appwxuser>(BusinessStatus.SUCCESS_GET, wxInfo);
        }
    }

    private Appwxuser getWxInfo(String openid) {
        Appwxuser appwxuser = this.appwxuserService.queryOneList(openid);
        return appwxuser;
    }

    private Appwxuser saveWxInfo(String nickName, Integer gender, String avatarUrl, String openid) {
        Appwxuser appwxuser = new Appwxuser();
        appwxuser.setNickname(nickName);
        appwxuser.setGender(gender);
        appwxuser.setAvatarUrl(avatarUrl);
        appwxuser.setOpenId(openid);
        this.appwxuserService.insert(appwxuser);
        Appwxuser queryOneList = this.appwxuserService.queryOneList(openid);
        return queryOneList;
    }

}
