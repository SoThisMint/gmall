package com.mint.gmall.usermanage.controller;

import com.mint.gmall.bean.UserInfo;
import com.mint.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: gmall
 * @description:
 * @author: mint
 * @create: 2019-05-21 23:47
 **/
@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("findAll")
    //@ResponseBody //返回json字符串，将数据显示在页面上
    public List<UserInfo> getAll() {
        return userInfoService.findAll();
    }
}
