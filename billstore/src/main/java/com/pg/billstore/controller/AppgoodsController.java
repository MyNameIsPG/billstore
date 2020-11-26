package com.pg.billstore.controller;

import com.github.pagehelper.Page;
import com.pg.billstore.entity.Appgoods;
import com.pg.billstore.handler.BusinessStatus;
import com.pg.billstore.handler.PageInfo;
import com.pg.billstore.handler.Result;
import com.pg.billstore.handler.ResultPage;
import com.pg.billstore.service.AppgoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Api(tags = "商品表")
@RequestMapping("/api/goods")
@RestController
public class AppgoodsController {

    private static Logger log = LoggerFactory.getLogger(AppgoodsController.class);

    @Autowired
    private AppgoodsService appgoodsService;

    @ApiOperation("分页查询")
    @PostMapping(value = "/queryPage")
    public ResultPage<Appgoods> queryPage(@RequestBody Appgoods appgoods) {
        log.info("活动模块-分页查询，参数appgoods={}", appgoods);
        Page<Appgoods> page = appgoodsService.queryPage(appgoods);
        PageInfo<Appgoods> pageInfo = new PageInfo<Appgoods>(page);
        return new ResultPage<Appgoods>(BusinessStatus.SUCCESS_GET, pageInfo);
    }

    @ApiOperation("查询全部")
    @GetMapping(value = "/queryAll")
    public Result<List<Appgoods>> queryAll() {
        log.info("活动模块-查询全部，参数appgoods={}");
        List<Appgoods> list = appgoodsService.queryAll();
        return new Result<List<Appgoods>>(BusinessStatus.SUCCESS_GET, list);
    }

    @ApiOperation("查询单条记录")
    @GetMapping(value = "/queryOne")
    public Result<Appgoods> queryOne(@RequestParam String goodId) {
        log.info("活动模块-查询单条记录，参数goodId={}", goodId);
        Appgoods one = appgoodsService.queryOne(goodId);
        return new Result<Appgoods>(BusinessStatus.SUCCESS_GET, one);
    }

    @ApiOperation("新增")
    @PostMapping(value = "/save")
    public Result<Appgoods> insert(@RequestBody Appgoods appgoods) {
        log.info("活动模块-新增，参数appgoods={}", appgoods);
        appgoodsService.insert(appgoods);
        return new Result<Appgoods>(BusinessStatus.SUCCESS_ADD);
    }

    @ApiOperation("修改")
    @PutMapping(value = "/update")
    public Result<Appgoods> update(@RequestBody Appgoods appgoods) {
        log.info("活动模块-修改，参数appgoods={}", appgoods);
        appgoodsService.update(appgoods);
        return new Result<Appgoods>(BusinessStatus.SUCCESS_UPDATE);
    }

    @ApiOperation("删除")
    @DeleteMapping(value = "/delete")
    public Result<Appgoods> delete(@RequestParam String goodId) {
        log.info("活动模块-删除，参数goodId={}", goodId);
        appgoodsService.delete(goodId);
        return new Result<Appgoods>(BusinessStatus.SUCCESS_DELETE);
    }

}
