package com.mfanw.test.mw_spring_boot.biz.impl;

import com.mfanw.test.mw_spring_boot.biz.IUserBiz;
import com.mfanw.test.mw_spring_boot.entity.UserEntity;
import com.mfanw.test.mw_spring_boot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBizImpl implements IUserBiz {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(UserEntity entity) {
        userMapper.insert(entity);
    }

    @Override
    public void get(Integer id) {
        // TODO Auto-generated method stub

    }

}
