package com.pg.billstore.controller;

import com.github.pagehelper.Page;
import com.pg.billstore.entity.Apppytype;
import com.pg.billstore.handler.BusinessStatus;
import com.pg.billstore.handler.PageInfo;
import com.pg.billstore.handler.Result;
import com.pg.billstore.handler.ResultPage;
import com.pg.billstore.service.ApppytypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Api(tags = "支出类别表")
@RequestMapping("/api/pytype")
@RestController
public class ApppytypeController {

    private static Logger log = LoggerFactory.getLogger(ApppytypeController.class);

    @Autowired
    private ApppytypeService apppytypeService;

    @ApiOperation("分页查询")
    @PostMapping(value = "/queryPage")
    public ResultPage<Apppytype> queryPage(@RequestBody Apppytype apppytype) {
        log.info("活动模块-分页查询，参数apppytype={}", apppytype);
        Page<Apppytype> page = apppytypeService.queryPage(apppytype);
        PageInfo<Apppytype> pageInfo = new PageInfo<Apppytype>(page);
        return new ResultPage<Apppytype>(BusinessStatus.SUCCESS_GET, pageInfo);
    }

    @ApiOperation("查询全部")
    @GetMapping(value = "/queryAll")
    public Result<List<Apppytype>> queryAll() {
        log.info("活动模块-查询全部，参数apppytype={}");
        List<Apppytype> list = apppytypeService.queryAll();
        return new Result<List<Apppytype>>(BusinessStatus.SUCCESS_GET, list);
    }

    @ApiOperation("查询单条记录")
    @GetMapping(value = "/queryOne")
    public Result<Apppytype> queryOne(@RequestParam String pywayId) {
        log.info("活动模块-查询单条记录，参数pywayId={}", pywayId);
        Apppytype one = apppytypeService.queryOne(pywayId);
        return new Result<Apppytype>(BusinessStatus.SUCCESS_GET, one);
    }

    @ApiOperation("新增")
    @PostMapping(value = "/save")
    public Result<Apppytype> insert(@RequestBody Apppytype apppytype) {
        log.info("活动模块-新增，参数apppytype={}", apppytype);
        apppytypeService.insert(apppytype);
        return new Result<Apppytype>(BusinessStatus.SUCCESS_ADD);
    }

    @ApiOperation("修改")
    @PutMapping(value = "/update")
    public Result<Apppytype> update(@RequestBody Apppytype apppytype) {
        log.info("活动模块-修改，参数apppytype={}", apppytype);
        apppytypeService.update(apppytype);
        return new Result<Apppytype>(BusinessStatus.SUCCESS_UPDATE);
    }

    @ApiOperation("删除")
    @DeleteMapping(value = "/delete")
    public Result<Apppytype> delete(@RequestParam String pywayId) {
        log.info("活动模块-删除，参数pywayId={}", pywayId);
        apppytypeService.delete(pywayId);
        return new Result<Apppytype>(BusinessStatus.SUCCESS_DELETE);
    }

}
