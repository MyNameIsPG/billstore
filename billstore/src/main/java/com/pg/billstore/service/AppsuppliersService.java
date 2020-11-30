package com.pg.billstore.service;

import com.github.pagehelper.Page;
import com.pg.billstore.entity.Appsuppliers;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppsuppliersService {

    Page<Appsuppliers> queryPage(Appsuppliers appsuppliers);

    List<Appsuppliers> queryAll();

    Appsuppliers queryOne(String suppliersId);

    Appsuppliers queryOneUsernameAndPhone(@Param("truename") String truename, @Param("phone") String phone);

    int insert(Appsuppliers appsuppliers);

    int update(Appsuppliers appsuppliers);

    int delete(String suppliersId);

}
