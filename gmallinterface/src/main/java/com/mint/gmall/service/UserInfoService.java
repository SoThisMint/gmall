package com.mint.gmall.service;

import com.mint.gmall.bean.UserInfo;

import java.util.List;

/**
 * @program: gmall
 * @description:
 * @author: mint
 * @create: 2019-05-21 22:46
 **/

public interface UserInfoService {

    List<UserInfo> findAll();

    List<UserInfo> findByPartNickName(String nickname);

    UserInfo findByNickName(String nickName);
}
