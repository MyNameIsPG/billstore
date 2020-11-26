package com.pg.billstore.controller;

import com.github.pagehelper.Page;
import com.pg.billstore.entity.Appgoodsprice;
import com.pg.billstore.handler.BusinessStatus;
import com.pg.billstore.handler.PageInfo;
import com.pg.billstore.handler.Result;
import com.pg.billstore.handler.ResultPage;
import com.pg.billstore.service.AppgoodspriceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Api(tags = "商品价格表")
@RequestMapping("/api/goodsprice")
@RestController
public class AppgoodspriceController {

    private static Logger log = LoggerFactory.getLogger(AppgoodspriceController.class);

    @Autowired
    private AppgoodspriceService appgoodspriceService;

    @ApiOperation("分页查询")
    @PostMapping(value = "/queryPage")
    public ResultPage<Appgoodsprice> queryPage(@RequestBody Appgoodsprice appgoodsprice) {
        log.info("活动模块-分页查询，参数appgoodsprice={}", appgoodsprice);
        Page<Appgoodsprice> page = appgoodspriceService.queryPage(appgoodsprice);
        PageInfo<Appgoodsprice> pageInfo = new PageInfo<Appgoodsprice>(page);
        return new ResultPage<Appgoodsprice>(BusinessStatus.SUCCESS_GET, pageInfo);
    }

    @ApiOperation("查询全部")
    @GetMapping(value = "/queryAll")
    public Result<List<Appgoodsprice>> queryAll() {
        log.info("活动模块-查询全部，参数appgoodsprice={}");
        List<Appgoodsprice> list = appgoodspriceService.queryAll();
        return new Result<List<Appgoodsprice>>(BusinessStatus.SUCCESS_GET, list);
    }

    @ApiOperation("查询单条记录")
    @GetMapping(value = "/queryOne")
    public Result<Appgoodsprice> queryOne(@RequestParam String goodspriceId) {
        log.info("活动模块-查询单条记录，参数goodspriceId={}", goodspriceId);
        Appgoodsprice one = appgoodspriceService.queryOne(goodspriceId);
        return new Result<Appgoodsprice>(BusinessStatus.SUCCESS_GET, one);
    }

    @ApiOperation("新增")
    @PostMapping(value = "/save")
    public Result<Appgoodsprice> insert(@RequestBody Appgoodsprice appgoodsprice) {
        log.info("活动模块-新增，参数appgoodsprice={}", appgoodsprice);
        appgoodspriceService.insert(appgoodsprice);
        return new Result<Appgoodsprice>(BusinessStatus.SUCCESS_ADD);
    }

    @ApiOperation("修改")
    @PutMapping(value = "/update")
    public Result<Appgoodsprice> update(@RequestBody Appgoodsprice appgoodsprice) {
        log.info("活动模块-修改，参数appgoodsprice={}", appgoodsprice);
        appgoodspriceService.update(appgoodsprice);
        return new Result<Appgoodsprice>(BusinessStatus.SUCCESS_UPDATE);
    }

    @ApiOperation("删除")
    @DeleteMapping(value = "/delete")
    public Result<Appgoodsprice> delete(@RequestParam String goodspriceId) {
        log.info("活动模块-删除，参数goodspriceId={}", goodspriceId);
        appgoodspriceService.delete(goodspriceId);
        return new Result<Appgoodsprice>(BusinessStatus.SUCCESS_DELETE);
    }

}
