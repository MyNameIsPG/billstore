package com.pg.billstore.dao;

import com.github.pagehelper.Page;
import com.pg.billstore.entity.Appsuppliers;

import java.util.List;

public interface AppsuppliersMapper {

    Page<Appsuppliers> queryPage(Appsuppliers appsuppliers);

    List<Appsuppliers> queryAll();

    Appsuppliers queryOne(String suppliersId);

    int insert(Appsuppliers appsuppliers);

    int update(Appsuppliers appsuppliers);

    int delete(String suppliersId);

}
