package com.example.demo.mapper;
import com.example.demo.entity.User1;
import com.example.demo.vo.Page;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface User1Mapper {

    @Select("select * from user1")
    List<User1> findAll();

    @Update("INSERT INTO `user1` (`username`,`password`,  `age`,`nick_name`, `sex`, `address`) VALUES (#{username},#{password}, #{age}, #{nickname},#{sex}, #{address});")
    @Transactional
    void save(User1 user1);

    @Update("update user set name=#{name}, address = #{address}, age=#{age}, sex=#{sex}, phone=#{phone} where id = #{id}")
    @Transactional
    void updateById(User1 user1);

    @Delete("delete from user1 where id = #{id}")
    void deleteById(Long id);

    @Select("select * from user1 where id = #{id}")
    User1 findById(Long id);

    @Select("select * from user limit #{offset},#{pageSize}")
    List<User1> findByPage(Integer offset, Integer pageSize);

    @Select("select count(id) from user")
    Integer countUser();

    @Select({"select * from user1 where username = #{username}"})
    User1 findByusername(String username);

    @Select({"select * from user1 where username = #{username} AND password=#{password}"})
    User1 findBynamepassword(String username, String password);

    @Select({"select * from user1 where username = #{username}"})
    User1 findinformation(String username);
}