package com.mfanw.test.mw_spring_boot.biz;

import com.mfanw.test.mw_spring_boot.entity.UserEntity;

/**
 * 用户操作Biz
 *
 * @author mengwei
 */
public interface IUserBiz {

    public void insert(UserEntity entity);

    public void get(Integer id);
}
