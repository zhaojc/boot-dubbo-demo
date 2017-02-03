package com.zhangbo.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhangbo.demo.api.Test1Service;
import com.zhangbo.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhangbo on 2017/2/3.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Reference
    Test1Service test1Service;

    @RequestMapping(value = "/{id}")
    @ResponseBody
    public User get(@PathVariable(value = "id") Long id) {
        return test1Service.get(id);
    }

    @RequestMapping(value = "save")
    @ResponseBody
    public Long save(User user) {
        return test1Service.save(user);
    }

    @RequestMapping(value = "get")
    public String getUser(Long id, Model model) {
        User user = test1Service.get(id);
        model.addAttribute("user", user);

        return "/user/user";
    }
}
