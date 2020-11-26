package com.pg.billstore.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.pg.billstore.dao.ApppywayMapper;
import com.pg.billstore.entity.Apppyway;
import com.pg.billstore.handler.BusinessException;
import com.pg.billstore.service.ApppywayService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ApppywayServiceImpl implements ApppywayService {

    @Autowired
    private ApppywayMapper apppywayMapper;

    @Override
    public Page<Apppyway> queryPage(Apppyway apppyway) {
        if (apppyway.getPageSize() != null && apppyway.getPageNum() != null) {
            PageHelper.startPage(apppyway.getPageNum(), apppyway.getPageSize());
        }
        Page<Apppyway> pages = this.apppywayMapper.queryPage(apppyway);
        return pages;
    }

    @Override
    public List<Apppyway> queryAll() {
        List<Apppyway> list = this.apppywayMapper.queryAll();
        return list;
    }

    @Override
    public Apppyway queryOne(String pywayId) {
        Apppyway one = this.apppywayMapper.queryOne(pywayId);
        return one;
    }

    @Override
    public int insert(Apppyway apppyway) {
        apppyway.setPywayId(UUID.randomUUID().toString().replace("-", ""));
        apppyway.setCreateTime(new Date());
        return this.apppywayMapper.insert(apppyway);
    }

    @Override
    public int update(Apppyway apppyway) {
        if (StringUtil.isEmpty(apppyway.getPywayId())) {
            throw new BusinessException(500, "pyway_id必传");
        }
        return this.apppywayMapper.update(apppyway);
    }

    @Override
    public int delete(String pywayId) {
        return this.apppywayMapper.delete(pywayId);
    }
}
