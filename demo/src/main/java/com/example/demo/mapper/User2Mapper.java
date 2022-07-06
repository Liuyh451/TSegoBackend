package com.example.demo.mapper;
import com.example.demo.entity.*;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface User2Mapper {

    @Select("select * from user2")
    List<User2> findAll();

    @Update("INSERT INTO `user2` (`username`,`password`, `email`,`phone`, `avatar`, `gender`,`age`,`signature`,`status`,`identity`,`createtime`,`userurl`) VALUES ( #{username},#{password}, #{email}, #{phone}, #{avatar},#{gender},#{age},#{signature},#{status},#{identity},#{createtime},#{userurl});")
    @Transactional
    void save(User2 user2);

    @Select({"select * from user2 where username = #{username}"})
    User2 login(@Param("username")String username);

    @Update("update user2 set password=#{newpassword} where id = #{id}")
    @Transactional
    void updateBypassword(password password);


    @Update("update user2 set  email=#{email},phone=#{phone}, avatar=#{avatar}, gender=#{gender},age=#{age},signature=#{signature},status=#{status},identity=#{identity},userurl=#{userurl}  where username=#{username} ")
    @Transactional
    void save1(User2 user2);

    @Update("update adress set  email=#{email},phone=#{phone}, avatar=#{avatar}, gender=#{gender},age=#{age},signature=#{signature},status=#{status},identity=#{identity},userurl=#{userurl}  where username=#{username} ")
    @Transactional
    void adresssave1(User2 user2);

    @Delete("delete from user2 where id = #{id}")
    void deleteById(Long id);

    @Select("select * from user2 where id = #{id}")
    User2 findById(Long id);

    @Select("select * from user2 limit #{offset},#{pageSize}")
    List<User2> findByPage(Integer offset, Integer pageSize);

    @Select("select count(id) from user2")
    Integer countUser();

    @Select({"select * from user2 where username = #{username}"})
    User2 findByusername(String username);

    @Select({"select * from user2 where username = #{username} AND password=#{password}"})
    User2 findBynamepassword(String username, String password);

    @Select({"select * from user2 where username = #{username}"})
    User2 findinformation(String username);
}