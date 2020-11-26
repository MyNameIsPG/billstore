package com.pg.billstore.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.pg.billstore.dao.AppuserMapper;
import com.pg.billstore.entity.Appuser;
import com.pg.billstore.handler.BusinessException;
import com.pg.billstore.service.AppuserService;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class AppuserServiceImpl implements AppuserService {

    @Autowired
    private AppuserMapper appuserMapper;

    @Override
    public Page<Appuser> queryPage(Appuser appuser) {
        if (appuser.getPageSize() != null && appuser.getPageNum() != null) {
            PageHelper.startPage(appuser.getPageNum(), appuser.getPageSize());
        }
        Page<Appuser> pages = this.appuserMapper.queryPage(appuser);
        return pages;
    }

    @Override
    public List<Appuser> queryAll() {
        List<Appuser> list = this.appuserMapper.queryAll();
        return list;
    }

    @Override
    public Appuser queryOne(String userId) {
        Appuser one = this.appuserMapper.queryOne(userId);
        return one;
    }

    @Override
    public int insert(Appuser appuser) {
        appuser.setUserId(UUID.randomUUID().toString().replace("-", ""));
        appuser.setCreateTime(new Date());
        return this.appuserMapper.insert(appuser);
    }

    @Override
    public int update(Appuser appuser) {
        if (StringUtil.isEmpty(appuser.getUserId())) {
            throw new BusinessException(500, "user_id必传");
        }
        return this.appuserMapper.update(appuser);
    }

    @Override
    public int delete(String userId) {
        return this.appuserMapper.delete(userId);
    }
}
