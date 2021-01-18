package com.cc.service.impl;

import com.cc.entity.Page;
import com.cc.entity.User;
import com.cc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author: jinjinwen
 * @description: impl
 * @date: 2021-01-18 17:12
 **/
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void getTList(Page<User> page) {

    }

    @Override
    public User getT(Integer id) {
        return null;
    }

    @Override
    public Integer modify(int type, User user) {
        return null;
    }

    @Override
    public int removeMore(Object... args) {
        return 0;
    }
}
