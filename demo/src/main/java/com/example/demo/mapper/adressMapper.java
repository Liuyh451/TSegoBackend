package com.example.demo.mapper;
import com.example.demo.entity.adress;
import com.example.demo.entity.orderitem;
import com.example.demo.entity.product;
import com.example.demo.vo.Page;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;
public interface adressMapper {



    @Select("select * from adress where username= #{username}")
    List<adress> findByusername(String username);

    @Update("update adress set address=#{address},province=#{province},phone=#{phone},city=#{city},district=#{district},name=#{name}  where username = #{username}")
    @Transactional
    void saveadress(adress adress);

    @Update("INSERT INTO `adress` (`id`,`username`, `address`,`province`, `phone`, `city`,`district`, `name`) VALUES (#{id},#{username},#{address}, #{province}, #{phone},#{city}, #{district},#{name});")
    @Transactional
    void save(adress adress);

}



