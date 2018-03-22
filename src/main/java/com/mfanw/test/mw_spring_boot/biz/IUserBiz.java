package com.mfanw.test.mw_spring_boot.biz;

import com.mfanw.test.mw_spring_boot.entity.UserEntity;

public interface IUserBiz {

	public void insert(UserEntity entity);

	public void get(Integer id);
}
