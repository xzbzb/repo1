package com.xzb.demo.controller;

import com.xzb.demo.entity.User;
import com.xzb.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * 用户请求处理
 *
 * @author 肖章兵
 * @date 2020年 10月10日 16:32:50
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    // 列出所有用户
    @GetMapping({"/list","/"})
    public ModelAndView index(ModelAndView modelAndView){
        List<User> users = userService.listUser();
        modelAndView.addObject("users",users);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    // 跳转至新增或者修改用户页面
    @GetMapping("/user/input/{id}")
    public ModelAndView add(ModelAndView modelAndView, @PathVariable Long id) {
        User userById = userService.getUserById(id);
        modelAndView.addObject("user",userById);
        modelAndView.setViewName("user-input");
        return  modelAndView;
    }
    // 新增用户 修改用户
    @PostMapping("/userInput")
    public String addUser(@Validated User user) {
        Long id = user.getId();
        if (id == null){
            userService.saveUser(user);
        }else {
            userService.updateUser(user);
        }
        return  "redirect:/list";
    }

    // 删除用户
    @RequestMapping("/delete/{id}")
    public String removeUser(@PathVariable Long id){
        userService.deleteUser(id);
        return  "redirect:/list";
    }
}
