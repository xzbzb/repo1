package com.xzb.demo.dao;

import com.xzb.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 数据持久层（用户增删改查）
 *
 * @author 肖章兵
 * @date 2020年 10月10日 16:18:28
 */
@Mapper
public interface UserMapper {

    // 查询所有用户
    List<User> listUsers();

    // 根据id查用户
    User getUserById(Long id);

    // 新增用户
    void saveUser(User user);

    // 修改用户
    void updateUser(User user);

    // 删除用户
    void deleteUser(Long id);
}

