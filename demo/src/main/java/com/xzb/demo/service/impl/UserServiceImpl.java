package com.xzb.demo.service.impl;

import com.xzb.demo.dao.UserMapper;
import com.xzb.demo.entity.User;
import com.xzb.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * UserService实现类
 *
 * @author 肖章兵
 * @date 2020年 10月10日 16:31:13
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    // 列出所有用户
    @Override
    public List<User> listUser() {
        return userMapper.listUsers();
    }

    // 根据id查询用户
    @Override
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }

    // 新增用户
    @Override
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }

    // 更新用户
    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    // 删除用户
    @Override
    public void deleteUser(Long id) {
        userMapper.deleteUser(id);
    }
}
