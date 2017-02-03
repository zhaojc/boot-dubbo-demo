package com.zhangbo.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhangbo.demo.api.Test1Service;
import com.zhangbo.demo.domain.User;
import com.zhangbo.demo.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhangbo on 2017/2/3.
 */
@Service
public class Test1ServiceImpl implements Test1Service {

    private Logger logger = LoggerFactory.getLogger(Test1ServiceImpl.class);

    @Autowired
    UserMapper userMapper;

    @Override
    public String test(String name) {

        logger.info("Test1ServiceImpl -- say: " + name);

        return "hello, " + name;
    }

    @Override
    public Long save(User user) {
        userMapper.insert(user);
        return user.getId();
    }

    @Override
    public User get(Long id) {
        return userMapper.getById(id);
    }
}
