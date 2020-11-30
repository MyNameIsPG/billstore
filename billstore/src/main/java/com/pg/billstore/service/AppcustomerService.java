package com.pg.billstore.service;

import com.github.pagehelper.Page;
import com.pg.billstore.entity.Appcustomer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppcustomerService {

    Page<Appcustomer> queryPage(Appcustomer appcustomer);

    List<Appcustomer> queryAll();

    Appcustomer queryOne(String customerId);

    Appcustomer queryOneUsernameAndPhone(@Param("truename") String truename, @Param("phone") String phone);

    int insert(Appcustomer appcustomer);

    int update(Appcustomer appcustomer);

    int delete(String customerId);

}
