package com.example.demo.mapper;
import com.example.demo.entity.User2;
import com.example.demo.entity.cart;
import com.example.demo.entity.product;
import com.example.demo.vo.Page;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;
public interface productMapper {

    @Select("select * from product ORDER BY RAND() LIMIT 6")
    List<product> findAll();

    @Select({"select * from product  WHERE categoryFirst=#{categoryFirst} ORDER BY RAND() LIMIT 6"})
    List<product> findBycategoryFirst(String categoryFirst);

    @Select("select * from product where id = #{id}")
    product findById(BigInteger id);

    @Select({"select * from product  where name like concat('%',#{name},'%') ORDER BY RAND() LIMIT 12"})
    List<product> findBysearch(String name);

    @Update("INSERT INTO `product` (`id`, `categoryfirst`, `categorysecond`,`name`, `picture`,`pictureurl`, `pictureurltwo`,`pictureurlthree`, `pictureurlfour`,`originplace`, `price`,`stock`, `detail`,`status`, `salesamount`,`createtime`,`updatetime`,`scrore`,`categoryid`,`username`) VALUES (#{id},#{categoryfirst},#{categorysecond},#{name},#{picture}, #{pictureurl}, #{pictureurltwo},#{pictureurlthree}, #{pictureurlfour},#{originplace},#{price}, #{stock}, #{detail},#{status},#{salesamount},#{createtime},#{updatetime},#{scrore},#{categoryid},#{username});")
    @Transactional
    void save(product product);

    @Select("select * from product where username = #{username}")
    List<product> findByusername(String username);




}
