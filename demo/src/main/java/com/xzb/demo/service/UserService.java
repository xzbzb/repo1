package com.xzb.demo.service;

import com.xzb.demo.entity.User;

import java.util.List;

public interface UserService {
    // 列出所有用户
    List<User> listUser();

    // 根据id获取用户
    User getUserById(Long id);

    // 新增用户
    void saveUser(User user);

    // 修改用户
    void updateUser(User user);

    // 删除用户
    void deleteUser(Long id);
}
