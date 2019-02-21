package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    User selectUserByObj(User user);

    List<User> selectUser();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}