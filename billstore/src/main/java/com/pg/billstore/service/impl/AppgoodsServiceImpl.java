package com.pg.billstore.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.pg.billstore.dao.AppgoodsMapper;
import com.pg.billstore.entity.Appgoods;
import com.pg.billstore.handler.BusinessException;
import com.pg.billstore.service.AppgoodsService;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class AppgoodsServiceImpl implements AppgoodsService {

    @Autowired
    private AppgoodsMapper appgoodsMapper;

    @Override
    public Page<Appgoods> queryPage(Appgoods appgoods) {
        if (appgoods.getPageSize() != null && appgoods.getPageNum() != null) {
            PageHelper.startPage(appgoods.getPageNum(), appgoods.getPageSize());
        }
        Page<Appgoods> pages = this.appgoodsMapper.queryPage(appgoods);
        return pages;
    }

    @Override
    public List<Appgoods> queryAll() {
        List<Appgoods> list = this.appgoodsMapper.queryAll();
        return list;
    }

    @Override
    public Appgoods queryOne(String goodId) {
        Appgoods one = this.appgoodsMapper.queryOne(goodId);
        return one;
    }

    @Override
    public int insert(Appgoods appgoods) {
        appgoods.setGoodId(UUID.randomUUID().toString().replace("-", ""));
        appgoods.setCreateTime(new Date());
        return this.appgoodsMapper.insert(appgoods);
    }

    @Override
    public int update(Appgoods appgoods) {
        if (StringUtil.isEmpty(appgoods.getGoodId())) {
            throw new BusinessException(500, "good_id必传");
        }
        return this.appgoodsMapper.update(appgoods);
    }

    @Override
    public int delete(String goodId) {
        return this.appgoodsMapper.delete(goodId);
    }
}
