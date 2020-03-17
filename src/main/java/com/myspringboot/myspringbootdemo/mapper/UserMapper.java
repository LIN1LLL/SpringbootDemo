package com.myspringboot.myspringbootdemo.mapper;

import com.myspringboot.myspringbootdemo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("insert into user (username,password,phoneNum,emileAddr) values(#{username},#{password},#{phoneNum},#{emileAddr})")
    public void Save(User user);

    @Select("select * from user where username = #{username} and password = #{password}")
    User Identify(String username, String password);
}
