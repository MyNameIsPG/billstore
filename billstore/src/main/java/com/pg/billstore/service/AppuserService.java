package com.pg.billstore.service;

import com.github.pagehelper.Page;
import com.pg.billstore.entity.Appuser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppuserService {

    Page<Appuser> queryPage(Appuser appuser);

    List<Appuser> queryAll();

    Appuser queryOne(String userId);

    Appuser quertOneUsernameAndPhone(@Param("truename") String truename, @Param("phone") String phone);

    int insert(Appuser appuser);

    int update(Appuser appuser);

    int delete(String userId);

}
