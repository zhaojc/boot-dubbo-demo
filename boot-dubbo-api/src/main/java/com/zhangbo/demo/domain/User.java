package com.zhangbo.demo.domain;

import java.io.Serializable;

/**
 * Created by zhangbo on 2017/1/9.
 */
public class User implements Serializable {

    private static final Long serialVersionUID = 1L;

    private Long id;

    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
