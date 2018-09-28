package com.qjx.acount.dao;

import com.qjx.acount.entry.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    /**
     *  删除用户
     * @param id
     * @return 返回影响的条数
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新建用户
     * @param record
     * @return 返回影响的行数
     */
    int insert(User record);


    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User userLogin(User user);

    int selectByUsername(String username);
}