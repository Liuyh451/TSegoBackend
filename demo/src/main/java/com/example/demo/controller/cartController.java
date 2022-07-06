package com.example.demo.controller;
import com.example.demo.common.Result;
import com.example.demo.entity.cart;
import com.example.demo.entity.product;
import com.example.demo.mapper.cartMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cart")
public class cartController {
    @Resource
    cartMapper cartMapper;

    @PostMapping({"/update"})
    public Result<?> user(@RequestBody cart cart) {

        return Result.success1("200", "购物车查询成功",cartMapper.findById(cart.getId()));

    }

    @PostMapping({"/addone"})
    public Result<?> add(@RequestBody cart cart) {
            cartMapper.save(cart);
            return Result.success1("200", "商品添加成功",cart);

    }

    @PostMapping({"/deleteone"})
    public Result<?> delete(@RequestBody cart cart) {
        cartMapper.delete(cart);
        return Result.success("200", "商品删除成功");

    }
}
