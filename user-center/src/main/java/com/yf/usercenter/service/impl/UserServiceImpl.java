package com.yf.usercenter.service.impl;

import com.yf.usercenter.entity.User;
import com.yf.usercenter.mapper.UserMapper;
import com.yf.usercenter.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分享 服务实现类
 * </p>
 *
 * @author yf
 * @since 2022-03-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
