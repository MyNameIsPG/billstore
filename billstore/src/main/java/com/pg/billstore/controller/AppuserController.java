package com.pg.billstore.controller;

import com.github.pagehelper.Page;
import com.pg.billstore.entity.Appuser;
import com.pg.billstore.handler.BusinessStatus;
import com.pg.billstore.handler.PageInfo;
import com.pg.billstore.handler.Result;
import com.pg.billstore.handler.ResultPage;
import com.pg.billstore.service.AppuserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Api(tags = "人员表")
@RequestMapping("/api/user")
@RestController
public class AppuserController {

    private static Logger log = LoggerFactory.getLogger(AppuserController.class);

    @Autowired
    private AppuserService appuserService;

    @ApiOperation("分页查询")
    @PostMapping(value = "/queryPage")
    public ResultPage<Appuser> queryPage(@RequestBody Appuser appuser) {
        log.info("活动模块-分页查询，参数appuser={}", appuser);
        Page<Appuser> page = appuserService.queryPage(appuser);
        PageInfo<Appuser> pageInfo = new PageInfo<Appuser>(page);
        return new ResultPage<Appuser>(BusinessStatus.SUCCESS_GET, pageInfo);
    }

    @ApiOperation("查询全部")
    @GetMapping(value = "/queryAll")
    public Result<List<Appuser>> queryAll() {
        log.info("活动模块-查询全部，参数appuser={}");
        List<Appuser> list = appuserService.queryAll();
        return new Result<List<Appuser>>(BusinessStatus.SUCCESS_GET, list);
    }

    @ApiOperation("查询单条记录")
    @GetMapping(value = "/queryOne")
    public Result<Appuser> queryOne(@RequestParam String userId) {
        log.info("活动模块-查询单条记录，参数userId={}", userId);
        Appuser one = appuserService.queryOne(userId);
        return new Result<Appuser>(BusinessStatus.SUCCESS_GET, one);
    }

    @ApiOperation("新增")
    @PostMapping(value = "/save")
    public Result<Appuser> insert(@RequestBody Appuser appuser) {
        log.info("活动模块-新增，参数appuser={}", appuser);
        appuserService.insert(appuser);
        return new Result<Appuser>(BusinessStatus.SUCCESS_ADD);
    }

    @ApiOperation("修改")
    @PutMapping(value = "/update")
    public Result<Appuser> update(@RequestBody Appuser appuser) {
        log.info("活动模块-修改，参数appuser={}", appuser);
        appuserService.update(appuser);
        return new Result<Appuser>(BusinessStatus.SUCCESS_UPDATE);
    }

    @ApiOperation("删除")
    @DeleteMapping(value = "/delete")
    public Result<Appuser> delete(@RequestParam String userId) {
        log.info("活动模块-删除，参数userId={}", userId);
        appuserService.delete(userId);
        return new Result<Appuser>(BusinessStatus.SUCCESS_DELETE);
    }

}
