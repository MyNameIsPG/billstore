package com.pg.billstore.dao;

import com.github.pagehelper.Page;
import com.pg.billstore.entity.Apppyway;

import java.util.List;

public interface ApppywayMapper {

    Page<Apppyway> queryPage(Apppyway apppyway);

    List<Apppyway> queryAll();

    Apppyway queryOne(String pywayId);

    int insert(Apppyway apppyway);

    int update(Apppyway apppyway);

    int delete(String pywayId);

}
