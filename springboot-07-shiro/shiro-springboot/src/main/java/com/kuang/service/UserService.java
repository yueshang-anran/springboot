package com.kuang.service;

import com.kuang.pojo.User;

/**
 * @author 书
 * @date 2021/4/21 - 19:18
 */
public interface UserService {

    public User queryUserByName(String name);
}
