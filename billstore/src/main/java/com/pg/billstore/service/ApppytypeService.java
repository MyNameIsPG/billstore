package com.pg.billstore.service;

import com.github.pagehelper.Page;
import com.pg.billstore.entity.Apppytype;

import java.util.List;

public interface ApppytypeService {

    Page<Apppytype> queryPage(Apppytype apppytype);

    List<Apppytype> queryAll();

    Apppytype queryOne(String pywayId);

    int insert(Apppytype apppytype);

    int update(Apppytype apppytype);

    int delete(String pywayId);

}
