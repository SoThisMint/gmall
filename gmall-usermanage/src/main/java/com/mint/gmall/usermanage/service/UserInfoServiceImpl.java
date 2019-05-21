package com.mint.gmall.usermanage.service;

import com.mint.gmall.bean.UserInfo;
import com.mint.gmall.service.UserInfoService;
import com.mint.gmall.usermanage.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @program: gmall
 * @description:
 * @author: mint
 * @create: 2019-05-21 23:45
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserInfo> findByPartNickName(String nickname) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andLike("nickName", "%"+nickname+"%");
        return userInfoMapper.selectByExample(example);
    }

    @Override
    public UserInfo findByNickName(String nickName) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("nickName", nickName);
        return userInfoMapper.selectOneByExample(example);
    }
}
