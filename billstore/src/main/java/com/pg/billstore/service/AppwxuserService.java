package com.pg.billstore.service;

import com.pg.billstore.entity.Appwxuser;

public interface AppwxuserService {

    Integer queryOneOpenId(String openId);

    Appwxuser queryOneList(String openId);

    int insert(Appwxuser appwxuser);

    int update(Appwxuser appwxuser);

    int updateOpenId(Appwxuser appwxuser);

}
