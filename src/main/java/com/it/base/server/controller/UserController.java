package com.it.base.server.controller;

import com.it.base.server.domain.User;
import com.it.base.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @description 用户接口
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public String save(@RequestBody @Valid User user) {
        return userService.addUser(user);
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setAccount("12345678");
        user.setPassword("12345678");
        user.setEmail(id + "@163.com");
        return user;
    }

}
