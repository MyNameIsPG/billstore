package com.pg.billstore.service.impl;

import com.pg.billstore.dao.AppwxuserMapper;
import com.pg.billstore.entity.Appwxuser;
import com.pg.billstore.service.AppwxuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class AppwxuserServiceImpl implements AppwxuserService {

    @Autowired
    private AppwxuserMapper appwxuserMapper;

    @Override
    public Integer queryOneOpenId(String openId) {
        return this.appwxuserMapper.queryOneOpenId(openId);
    }

    @Override
    public Appwxuser queryOneList(String openId) {
        return this.appwxuserMapper.queryOneList(openId);
    }

    @Override
    public int insert(Appwxuser appwxuser) {
        appwxuser.setWxId(UUID.randomUUID().toString().replace("-", ""));
        appwxuser.setCreateTime(new Date());
        return this.appwxuserMapper.insert(appwxuser);
    }

    @Override
    public int update(Appwxuser appwxuser) {
        appwxuser.setUpdateTime(new Date());
        return this.appwxuserMapper.update(appwxuser);
    }
}
