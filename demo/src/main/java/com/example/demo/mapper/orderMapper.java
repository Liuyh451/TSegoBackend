package com.example.demo.mapper;
import com.example.demo.entity.User1;
import com.example.demo.entity.cart;
import com.example.demo.entity.orderitem;
import com.example.demo.entity.order;
import com.example.demo.vo.Page;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;
public interface orderMapper {

    @Select("select * from oderitem where username = #{username} AND orderstatus=#{orderstatus}")
    List<orderitem> findByuserId(String username,String orderstatus);

    @Select("select * from oderitem where orderstatus!=#{orderstatus}")
    List<orderitem> findByseller(String orderstatus);

    @Select("select * from oderitem where username = #{username} ")
    List<orderitem> findByuser(String username);

    @Select("select * from oderitem where orderstatus=#{orderstatus} ")
    List<orderitem> findBystatus(String orderstatus);
    @Select("SELECT count(*) from oderitem where categoryfirst=#{categoryfirst} AND username=#{username}")
    Integer findusercount(String categoryfirst,String username);
    @Delete("delete from oderitem where orderid=#{orderid}")
    void delete(orderitem orderitem);

    @Select("select * from oderitem where orderid = #{orderid} AND orderstatus=#{orderstatus}")
    List<orderitem> findByorderId(Integer orderid,String orderstatus);

    @Select("select * from oderitem where orderid = #{orderid} AND orderstatus!=#{orderstatus}")
    List<orderitem> findBysellerid(Integer orderid,String orderstatus);

    @Select("select * from oderitem where orderid = #{orderid}")
    List<orderitem> findByorder(Integer orderid);

    @Update("INSERT INTO `oderitem` (`id`, `username`,`orderid`, `productid`,`productName`, `productPicture`,`productpictureurl`, `categoryfirst`,`categorysecond`, `productPrice`,`quantity`, `totalprice`,`productdetails`,`orderstatus`) VALUES (#{id},#{username},#{orderid},#{productid}, #{productName}, #{productPicture},#{productpictureurl}, #{categoryfirst},#{categorysecond},#{productPrice}, #{quantity}, #{totalprice},#{productdetails},#{orderstatus});")
    @Transactional
    void save(orderitem orderitem);

    @Update("update  oderitem set orderstatus=#{orderstatus} where orderid = #{orderid}")
    @Transactional
    void pay(String orderstatus,Integer orderid);

    @Update("update  oderitem set orderstatus=#{orderstatus} where orderid = #{orderid}")
    @Transactional
    void change(Integer orderid,String orderstatus);

    @Select("SELECT count(*) from oderitem where categoryfirst=#{categoryfirst}")
    Integer findcount(String categoryfirst);




}
