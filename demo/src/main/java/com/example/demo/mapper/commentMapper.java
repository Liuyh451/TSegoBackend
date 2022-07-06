package com.example.demo.mapper;
import com.example.demo.entity.*;
import com.example.demo.vo.Page;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;
public interface commentMapper {

    @Select("select * from comment where username = #{username}")
    List<comment> findByusername(String username);

    @Select("select * from comment where productid = #{productid}")
    List<comment> findByproductid(BigInteger productid);

    @Update("INSERT INTO `comment` (`id`, `comment`,`userid`,`username`, `useravatar`, `productid`,`producturl`, `productname`, `createtime`,`star`) VALUES (#{id},#{comment},#{userid},#{username},#{useravatar},#{productid}, #{producturl},#{productname}, #{createtime}, #{star});")
    @Transactional
    void save(comment comment);
}
