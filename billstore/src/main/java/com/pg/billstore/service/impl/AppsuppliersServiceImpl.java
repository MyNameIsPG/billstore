package com.pg.billstore.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.pg.billstore.dao.AppsuppliersMapper;
import com.pg.billstore.entity.Appsuppliers;
import com.pg.billstore.handler.BusinessException;
import com.pg.billstore.service.AppsuppliersService;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class AppsuppliersServiceImpl implements AppsuppliersService {

    @Autowired
    private AppsuppliersMapper appsuppliersMapper;

    @Override
    public Page<Appsuppliers> queryPage(Appsuppliers appsuppliers) {
        if (appsuppliers.getPageSize() != null && appsuppliers.getPageNum() != null) {
            PageHelper.startPage(appsuppliers.getPageNum(), appsuppliers.getPageSize());
        }
        Page<Appsuppliers> pages = this.appsuppliersMapper.queryPage(appsuppliers);
        return pages;
    }

    @Override
    public List<Appsuppliers> queryAll() {
        List<Appsuppliers> list = this.appsuppliersMapper.queryAll();
        return list;
    }

    @Override
    public Appsuppliers queryOne(String suppliersId) {
        Appsuppliers one = this.appsuppliersMapper.queryOne(suppliersId);
        return one;
    }

    @Override
    public int insert(Appsuppliers appsuppliers) {
        appsuppliers.setSuppliersId(UUID.randomUUID().toString().replace("-", ""));
        appsuppliers.setCreateTime(new Date());
        return this.appsuppliersMapper.insert(appsuppliers);
    }

    @Override
    public int update(Appsuppliers appsuppliers) {
        if (StringUtil.isEmpty(appsuppliers.getSuppliersId())) {
            throw new BusinessException(500, "suppliers_id必传");
        }
        return this.appsuppliersMapper.update(appsuppliers);
    }

    @Override
    public int delete(String suppliersId) {
        return this.appsuppliersMapper.delete(suppliersId);
    }
}
