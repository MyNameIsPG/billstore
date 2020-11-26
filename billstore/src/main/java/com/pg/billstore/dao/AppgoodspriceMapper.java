package com.pg.billstore.dao;

import com.github.pagehelper.Page;
import com.pg.billstore.entity.Appgoodsprice;

import java.util.List;

public interface AppgoodspriceMapper {

    Page<Appgoodsprice> queryPage(Appgoodsprice appgoodsprice);

    List<Appgoodsprice> queryAll();

    Appgoodsprice queryOne(String goodspriceId);

    int insert(Appgoodsprice appgoodsprice);

    int update(Appgoodsprice appgoodsprice);

    int delete(String goodspriceId);

}
