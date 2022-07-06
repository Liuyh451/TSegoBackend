package com.example.demo.mapper;
import com.example.demo.entity.cart;
import com.example.demo.entity.product;
import com.example.demo.vo.Page;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;
public interface cartMapper {

    @Update("INSERT INTO `cart` (`id`, `userid`, `productid`,`productname`, `productpicture`,`oldprice`, `currentprice`,`quantity`, `lowestprice`,`status`, `createtime`,`updatetime`, `notify`) VALUES (#{id},#{userid},#{productid}, #{productname}, #{productpicture},#{oldprice}, #{currentprice},#{quantity},#{lowestprice}, #{status}, #{createtime},#{updatetime},#{notify});")
    @Transactional
    void save(cart cart);

    @Select("select * from cart where id = #{id}")
    List<cart> findById(Integer id);

    @Delete("delete from cart where id = #{id} and productid=#{productid}")
    void delete(cart cart);
}
