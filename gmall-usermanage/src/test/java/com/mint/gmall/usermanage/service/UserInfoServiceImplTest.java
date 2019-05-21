package com.mint.gmall.usermanage.service;

import com.mint.gmall.bean.UserInfo;
import com.mint.gmall.service.UserInfoService;
import com.mint.gmall.usermanage.mapper.UserInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @program: gmall
 * @description:
 * @author: mint
 * @create: 2019-05-22 00:08
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserInfoServiceImplTest {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void insertTest() {
        UserInfo userInfo = new UserInfo("1", "test", "test", "test", "13517240000", "test@163.com", "www.baidu.com", "2");
        userInfoMapper.insert(userInfo);
    }

    @Test
    public void findByPartNickNameTest(){
        List<UserInfo> list = userInfoService.findByPartNickName("d");
        System.out.println(list);
    }

    @Test
    public void selectTest() {
        UserInfo userInfo = userInfoService.findByNickName("admin");
        System.out.println(userInfo);
    }
}