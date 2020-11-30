package com.pg.billstore.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.pg.billstore.dao.AppcustomerMapper;
import com.pg.billstore.entity.Appcustomer;
import com.pg.billstore.handler.BusinessException;
import com.pg.billstore.service.AppcustomerService;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class AppcustomerServiceImpl implements AppcustomerService {

    @Autowired
    private AppcustomerMapper appcustomerMapper;

    @Override
    public Page<Appcustomer> queryPage(Appcustomer appcustomer) {
        if (appcustomer.getPageSize() != null && appcustomer.getPageNum() != null) {
            PageHelper.startPage(appcustomer.getPageNum(), appcustomer.getPageSize());
        }
        Page<Appcustomer> pages = this.appcustomerMapper.queryPage(appcustomer);
        return pages;
    }

    @Override
    public List<Appcustomer> queryAll() {
        List<Appcustomer> list = this.appcustomerMapper.queryAll();
        return list;
    }

    @Override
    public Appcustomer queryOne(String customerId) {
        Appcustomer one = this.appcustomerMapper.queryOne(customerId);
        return one;
    }

    @Override
    public Appcustomer queryOneUsernameAndPhone(String truename, String phone) {
        return this.appcustomerMapper.queryOneUsernameAndPhone(truename, phone);
    }

    @Override
    public int insert(Appcustomer appcustomer) {
        appcustomer.setCustomerId(UUID.randomUUID().toString().replace("-", ""));
        appcustomer.setCreateTime(new Date());
        return this.appcustomerMapper.insert(appcustomer);
    }

    @Override
    public int update(Appcustomer appcustomer) {
        if (StringUtil.isEmpty(appcustomer.getCustomerId())) {
            throw new BusinessException(500, "customer_id必传");
        }
        return this.appcustomerMapper.update(appcustomer);
    }

    @Override
    public int delete(String customerId) {
        return this.appcustomerMapper.delete(customerId);
    }
}
