package com.pg.billstore.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.pg.billstore.dao.ApppytypeMapper;
import com.pg.billstore.entity.Apppytype;
import com.pg.billstore.handler.BusinessException;
import com.pg.billstore.service.ApppytypeService;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ApppytypeServiceImpl implements ApppytypeService {

    @Autowired
    private ApppytypeMapper apppytypeMapper;

    @Override
    public Page<Apppytype> queryPage(Apppytype apppytype) {
        if (apppytype.getPageSize() != null && apppytype.getPageNum() != null) {
            PageHelper.startPage(apppytype.getPageNum(), apppytype.getPageSize());
        }
        Page<Apppytype> pages = this.apppytypeMapper.queryPage(apppytype);
        return pages;
    }

    @Override
    public List<Apppytype> queryAll() {
        List<Apppytype> list = this.apppytypeMapper.queryAll();
        return list;
    }

    @Override
    public Apppytype queryOne(String pywayId) {
        Apppytype one = this.apppytypeMapper.queryOne(pywayId);
        return one;
    }

    @Override
    public int insert(Apppytype apppytype) {
        apppytype.setPywayId(UUID.randomUUID().toString().replace("-", ""));
        apppytype.setCreateTime(new Date());
        return this.apppytypeMapper.insert(apppytype);
    }

    @Override
    public int update(Apppytype apppytype) {
        if (StringUtil.isEmpty(apppytype.getPywayId())) {
            throw new BusinessException(500, "pyway_id必传");
        }
        return this.apppytypeMapper.update(apppytype);
    }

    @Override
    public int delete(String pywayId) {
        return this.apppytypeMapper.delete(pywayId);
    }
}
