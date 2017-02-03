package com.zhangbo.demo.mapper;

import com.zhangbo.demo.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by zhangbo on 2017/1/9.
 */
@Repository
public interface UserMapper {

    User getById(Long id);

    Long insert(User entity);
}
