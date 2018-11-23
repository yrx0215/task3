package com.jnshu.clroom.mapper;

import com.jnshu.clroom.beans.UserGusetboot;

public interface UserGusetbootMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserGusetboot record);

    int insertSelective(UserGusetboot record);

    UserGusetboot selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserGusetboot record);

    int updateByPrimaryKey(UserGusetboot record);
}