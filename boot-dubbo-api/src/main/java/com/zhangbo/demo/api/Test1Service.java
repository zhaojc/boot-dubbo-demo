package com.zhangbo.demo.api;

import com.zhangbo.demo.domain.User;

/**
 * Created by zhangbo on 2017/2/3.
 */
public interface Test1Service {

    String test(String name);

    Long save(User user);

    User get(Long id);

}
