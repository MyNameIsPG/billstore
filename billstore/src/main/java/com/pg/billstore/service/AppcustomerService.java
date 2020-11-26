package com.pg.billstore.service;

import com.github.pagehelper.Page;
import com.pg.billstore.entity.Appcustomer;

import java.util.List;

public interface AppcustomerService {

    Page<Appcustomer> queryPage(Appcustomer appcustomer);

    List<Appcustomer> queryAll();

    Appcustomer queryOne(String customerId);

    int insert(Appcustomer appcustomer);

    int update(Appcustomer appcustomer);

    int delete(String customerId);

}
