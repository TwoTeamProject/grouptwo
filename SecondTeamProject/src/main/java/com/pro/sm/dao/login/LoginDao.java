package com.pro.sm.dao.login;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * className:LoginDao
 * discription:
 * author:sjq
 * createTime:2018-11-22 09:52
 */
public interface LoginDao {

    /**
     * 登陆验证
     * @param map
     * @return
     */
    List<Map> userLogin(Map map);
}
