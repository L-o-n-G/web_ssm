package com.shixun.dao;

import com.shixun.entity.Clazz;
import org.springframework.stereotype.Repository;

@Repository
public interface ClazzMapper {
    int deleteByPrimaryKey(String id);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    Clazz selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}