package com.pg.billstore.dao;

import com.pg.billstore.entity.Appwxuser;

public interface AppwxuserMapper {

    /**
     * 根据微信openid查询记录是否存在
     * @param openId
     */
    int queryOneOpenId(String openId);

    Appwxuser queryOneList(String openId);

    int insert(Appwxuser appwxuser);

    int update(Appwxuser appwxuser);

    int updateOpenId(Appwxuser appwxuser);
}
