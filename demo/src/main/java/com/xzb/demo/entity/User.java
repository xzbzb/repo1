package com.xzb.demo.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * 用户实体类
 *
 * @author 肖章兵
 * @date 2020年 10月10日 16:07:45
 */
public class User {
    // 用户id
    private Long id;

    // 用户名称
    @NotBlank(message = "名字不能为空")
    private String userName;

    // 用户年龄
    @Min(value = 0,message = "年龄最小为0")
    @Max(value = 120,message = "年龄最大为120")
    private String userAge;

    // 用户地址
    @NotBlank(message = "地址不能为空")
    private String userAddress;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
