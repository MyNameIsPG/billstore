package com.pg.billstore.service;

import com.github.pagehelper.Page;
import com.pg.billstore.entity.Appuser;

import java.util.List;

public interface AppuserService {

    Page<Appuser> queryPage(Appuser appuser);

    List<Appuser> queryAll();

    Appuser queryOne(String userId);

    Appuser quertOneOpenId(String openId);

    int insert(Appuser appuser);

    int update(Appuser appuser);

    int delete(String userId);

}
