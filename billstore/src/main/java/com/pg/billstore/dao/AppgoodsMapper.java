package com.pg.billstore.dao;

import com.github.pagehelper.Page;
import com.pg.billstore.entity.Appgoods;

import java.util.List;

public interface AppgoodsMapper {

    Page<Appgoods> queryPage(Appgoods appgoods);

    List<Appgoods> queryAll();

    Appgoods queryOne(String goodId);

    int insert(Appgoods appgoods);

    int update(Appgoods appgoods);

    int delete(String goodId);

}
