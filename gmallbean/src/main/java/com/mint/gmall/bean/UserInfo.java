package com.mint.gmall.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @program: gmall
 * @description: userPojo
 * @author: mint
 * @create: 2019-05-21 22:04
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
//为什么要实现序列化？因为：UserInfo会通过dubbo的提供者，发布到注册中心上，要经过网络传输
public class UserInfo implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String loginName;

    @Column
    private String nickName;

    @Column
    private String passwd;

    @Column
    private String phoneNum;

    @Column
    private String email;

    @Column
    private String headImg;

    @Column
    private String userLevel;

}
