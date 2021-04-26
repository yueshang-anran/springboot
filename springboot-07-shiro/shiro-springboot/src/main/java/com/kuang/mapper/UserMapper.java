package com.kuang.mapper;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 书
 * @date 2021/4/21 - 19:17
 */
@Repository
@Mapper
public interface UserMapper {

    public User queryUserByName(String name);
}
