package com.pg.billstore.controller;

import com.github.pagehelper.Page;
import com.pg.billstore.entity.Apppyway;
import com.pg.billstore.handler.BusinessStatus;
import com.pg.billstore.handler.PageInfo;
import com.pg.billstore.handler.Result;
import com.pg.billstore.handler.ResultPage;
import com.pg.billstore.service.ApppywayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Api(tags = "付款方式表")
@RequestMapping("/api/pyway")
@RestController
public class ApppywayController {

    private static Logger log = LoggerFactory.getLogger(ApppywayController.class);

    @Autowired
    private ApppywayService apppywayService;

    @ApiOperation("分页查询")
    @PostMapping(value = "/queryPage")
    public ResultPage<Apppyway> queryPage(@RequestBody Apppyway apppyway) {
        log.info("活动模块-分页查询，参数apppyway={}", apppyway);
        Page<Apppyway> page = apppywayService.queryPage(apppyway);
        PageInfo<Apppyway> pageInfo = new PageInfo<Apppyway>(page);
        return new ResultPage<Apppyway>(BusinessStatus.SUCCESS_GET, pageInfo);
    }

    @ApiOperation("查询全部")
    @GetMapping(value = "/queryAll")
    public Result<List<Apppyway>> queryAll() {
        log.info("活动模块-查询全部，参数apppyway={}");
        List<Apppyway> list = apppywayService.queryAll();
        return new Result<List<Apppyway>>(BusinessStatus.SUCCESS_GET, list);
    }

    @ApiOperation("查询单条记录")
    @GetMapping(value = "/queryOne")
    public Result<Apppyway> queryOne(@RequestParam String pywayId) {
        log.info("活动模块-查询单条记录，参数pywayId={}", pywayId);
        Apppyway one = apppywayService.queryOne(pywayId);
        return new Result<Apppyway>(BusinessStatus.SUCCESS_GET, one);
    }

    @ApiOperation("新增")
    @PostMapping(value = "/save")
    public Result<Apppyway> insert(@RequestBody Apppyway apppyway) {
        log.info("活动模块-新增，参数apppyway={}", apppyway);
        apppywayService.insert(apppyway);
        return new Result<Apppyway>(BusinessStatus.SUCCESS_ADD);
    }

    @ApiOperation("修改")
    @PutMapping(value = "/update")
    public Result<Apppyway> update(@RequestBody Apppyway apppyway) {
        log.info("活动模块-修改，参数apppyway={}", apppyway);
        apppywayService.update(apppyway);
        return new Result<Apppyway>(BusinessStatus.SUCCESS_UPDATE);
    }

    @ApiOperation("删除")
    @DeleteMapping(value = "/delete")
    public Result<Apppyway> delete(@RequestParam String pywayId) {
        log.info("活动模块-删除，参数pywayId={}", pywayId);
        apppywayService.delete(pywayId);
        return new Result<Apppyway>(BusinessStatus.SUCCESS_DELETE);
    }

}
