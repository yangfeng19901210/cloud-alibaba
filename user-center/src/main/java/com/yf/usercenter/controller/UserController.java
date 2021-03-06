package com.yf.usercenter.controller;


import com.yf.usercenter.entity.User;
import com.yf.usercenter.service.UserService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 分享 前端控制器
 * </p>
 *
 * @author yf
 * @since 2022-03-18
 */
@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  private UserService userService;
  @GetMapping("/{id}")
  public User getUserById(@PathVariable Integer id){
    return userService.getById(id);
  }

  @PostMapping
  public String saveUser(@RequestBody @Valid User user, BindingResult results){
    if (results.hasErrors())
      return results.getFieldError().getDefaultMessage();
    userService.save(user);
    return "ok";
  }


}

