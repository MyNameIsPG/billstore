package com.pg.billstore.controller;

import com.github.pagehelper.Page;
import com.pg.billstore.entity.Appcustomer;
import com.pg.billstore.handler.BusinessStatus;
import com.pg.billstore.handler.PageInfo;
import com.pg.billstore.handler.Result;
import com.pg.billstore.handler.ResultPage;
import com.pg.billstore.service.AppcustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Api(tags = "客户表")
@RequestMapping("/api/customer")
@RestController
public class AppcustomerController {

    private static Logger log = LoggerFactory.getLogger(AppcustomerController.class);

    @Autowired
    private AppcustomerService appcustomerService;

    @ApiOperation("分页查询")
    @PostMapping(value = "/queryPage")
    public ResultPage<Appcustomer> queryPage(@RequestBody Appcustomer appcustomer) {
        log.info("活动模块-分页查询，参数appcustomer={}", appcustomer);
        Page<Appcustomer> page = appcustomerService.queryPage(appcustomer);
        PageInfo<Appcustomer> pageInfo = new PageInfo<Appcustomer>(page);
        return new ResultPage<Appcustomer>(BusinessStatus.SUCCESS_GET, pageInfo);
    }

    @ApiOperation("查询全部")
    @GetMapping(value = "/queryAll")
    public Result<List<Appcustomer>> queryAll() {
        log.info("活动模块-查询全部，参数appcustomer={}");
        List<Appcustomer> list = appcustomerService.queryAll();
        return new Result<List<Appcustomer>>(BusinessStatus.SUCCESS_GET, list);
    }

    @ApiOperation("查询单条记录")
    @GetMapping(value = "/queryOne")
    public Result<Appcustomer> queryOne(@RequestParam String customerId) {
        log.info("活动模块-查询单条记录，参数customerId={}", customerId);
        Appcustomer one = appcustomerService.queryOne(customerId);
        return new Result<Appcustomer>(BusinessStatus.SUCCESS_GET, one);
    }

    @ApiOperation("新增")
    @PostMapping(value = "/save")
    public Result<Appcustomer> insert(@RequestBody Appcustomer appcustomer) {
        log.info("活动模块-新增，参数appcustomer={}", appcustomer);
        appcustomerService.insert(appcustomer);
        return new Result<Appcustomer>(BusinessStatus.SUCCESS_ADD);
    }

    @ApiOperation("修改")
    @PutMapping(value = "/update")
    public Result<Appcustomer> update(@RequestBody Appcustomer appcustomer) {
        log.info("活动模块-修改，参数appcustomer={}", appcustomer);
        appcustomerService.update(appcustomer);
        return new Result<Appcustomer>(BusinessStatus.SUCCESS_UPDATE);
    }

    @ApiOperation("删除")
    @DeleteMapping(value = "/delete")
    public Result<Appcustomer> delete(@RequestParam String customerId) {
        log.info("活动模块-删除，参数customerId={}", customerId);
        appcustomerService.delete(customerId);
        return new Result<Appcustomer>(BusinessStatus.SUCCESS_DELETE);
    }

}
