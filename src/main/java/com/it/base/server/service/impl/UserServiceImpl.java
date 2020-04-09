package com.it.base.server.service.impl;

import com.it.base.server.domain.User;
import com.it.base.server.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @description 用户业务实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String addUser(User user) {
        // 直接编写业务逻辑
        return "success";
    }
}
