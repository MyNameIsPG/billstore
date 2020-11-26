package com.pg.billstore.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.pg.billstore.dao.AppgoodspriceMapper;
import com.pg.billstore.entity.Appgoodsprice;
import com.pg.billstore.handler.BusinessException;
import com.pg.billstore.service.AppgoodspriceService;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class AppgoodspriceServiceImpl implements AppgoodspriceService {

    @Autowired
    private AppgoodspriceMapper appgoodspriceMapper;

    @Override
    public Page<Appgoodsprice> queryPage(Appgoodsprice appgoodsprice) {
        if (appgoodsprice.getPageSize() != null && appgoodsprice.getPageNum() != null) {
            PageHelper.startPage(appgoodsprice.getPageNum(), appgoodsprice.getPageSize());
        }
        Page<Appgoodsprice> pages = this.appgoodspriceMapper.queryPage(appgoodsprice);
        return pages;
    }

    @Override
    public List<Appgoodsprice> queryAll() {
        List<Appgoodsprice> list = this.appgoodspriceMapper.queryAll();
        return list;
    }

    @Override
    public Appgoodsprice queryOne(String goodspriceId) {
        Appgoodsprice one = this.appgoodspriceMapper.queryOne(goodspriceId);
        return one;
    }

    @Override
    public int insert(Appgoodsprice appgoodsprice) {
        appgoodsprice.setGoodspriceId(UUID.randomUUID().toString().replace("-", ""));
        appgoodsprice.setCreateTime(new Date());
        return this.appgoodspriceMapper.insert(appgoodsprice);
    }

    @Override
    public int update(Appgoodsprice appgoodsprice) {
        if (StringUtil.isEmpty(appgoodsprice.getGoodspriceId())) {
            throw new BusinessException(500, "goodsprice_id必传");
        }
        return this.appgoodspriceMapper.update(appgoodsprice);
    }

    @Override
    public int delete(String goodspriceId) {
        return this.appgoodspriceMapper.delete(goodspriceId);
    }
}
