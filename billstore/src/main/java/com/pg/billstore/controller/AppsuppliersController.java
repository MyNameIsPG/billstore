package com.pg.billstore.controller;

import com.github.pagehelper.Page;
import com.pg.billstore.entity.Appsuppliers;
import com.pg.billstore.handler.BusinessStatus;
import com.pg.billstore.handler.PageInfo;
import com.pg.billstore.handler.Result;
import com.pg.billstore.handler.ResultPage;
import com.pg.billstore.service.AppsuppliersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Api(tags = "供应商表")
@RequestMapping("/api/suppliers")
@RestController
public class AppsuppliersController {

    private static Logger log = LoggerFactory.getLogger(AppsuppliersController.class);

    @Autowired
    private AppsuppliersService appsuppliersService;

    @ApiOperation("分页查询")
    @PostMapping(value = "/queryPage")
    public ResultPage<Appsuppliers> queryPage(@RequestBody Appsuppliers appsuppliers) {
        log.info("活动模块-分页查询，参数appsuppliers={}", appsuppliers);
        Page<Appsuppliers> page = appsuppliersService.queryPage(appsuppliers);
        PageInfo<Appsuppliers> pageInfo = new PageInfo<Appsuppliers>(page);
        return new ResultPage<Appsuppliers>(BusinessStatus.SUCCESS_GET, pageInfo);
    }

    @ApiOperation("查询全部")
    @GetMapping(value = "/queryAll")
    public Result<List<Appsuppliers>> queryAll() {
        log.info("活动模块-查询全部，参数appsuppliers={}");
        List<Appsuppliers> list = appsuppliersService.queryAll();
        return new Result<List<Appsuppliers>>(BusinessStatus.SUCCESS_GET, list);
    }

    @ApiOperation("查询单条记录")
    @GetMapping(value = "/queryOne")
    public Result<Appsuppliers> queryOne(@RequestParam String suppliersId) {
        log.info("活动模块-查询单条记录，参数suppliersId={}", suppliersId);
        Appsuppliers one = appsuppliersService.queryOne(suppliersId);
        return new Result<Appsuppliers>(BusinessStatus.SUCCESS_GET, one);
    }

    @ApiOperation("新增")
    @PostMapping(value = "/save")
    public Result<Appsuppliers> insert(@RequestBody Appsuppliers appsuppliers) {
        log.info("活动模块-新增，参数appsuppliers={}", appsuppliers);
        appsuppliersService.insert(appsuppliers);
        return new Result<Appsuppliers>(BusinessStatus.SUCCESS_ADD);
    }

    @ApiOperation("修改")
    @PutMapping(value = "/update")
    public Result<Appsuppliers> update(@RequestBody Appsuppliers appsuppliers) {
        log.info("活动模块-修改，参数appsuppliers={}", appsuppliers);
        appsuppliersService.update(appsuppliers);
        return new Result<Appsuppliers>(BusinessStatus.SUCCESS_UPDATE);
    }

    @ApiOperation("删除")
    @DeleteMapping(value = "/delete")
    public Result<Appsuppliers> delete(@RequestParam String suppliersId) {
        log.info("活动模块-删除，参数suppliersId={}", suppliersId);
        appsuppliersService.delete(suppliersId);
        return new Result<Appsuppliers>(BusinessStatus.SUCCESS_DELETE);
    }

}
