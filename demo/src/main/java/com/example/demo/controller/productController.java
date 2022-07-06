package com.example.demo.controller;
import com.example.demo.common.Result;
import com.example.demo.entity.cart;
import com.example.demo.entity.product;
import com.example.demo.mapper.productMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class productController {
    @Resource
    productMapper productMapper;

    @GetMapping
    public  Result<?> getproduct() {
        return Result.success1("200","cg",productMapper.findAll());
    }


    @PostMapping({"/search"})
    public Result<?> search(@RequestBody product product) {

            return Result.success1("200", "查找成功",productMapper.findBycategoryFirst(product.getcategoryFirst()));

    }

    @PostMapping({"/search1"})
    public Result<?> search3(@RequestBody product product) {

        return Result.success1("200", "查找成功",productMapper.findBysearch(product.getname()));

    }
    @PostMapping({"/getone"})
    public Result<?> search1(@RequestBody product product) {
        product pro = this.productMapper.findById(product.getId());
        if (pro == null) {
            return Result.error("404", "找不到相关商品");
        } else {
            return Result.success1("200", "商品信息咨询成功",pro);
        }
    }

    @PostMapping({"/addone"})
    public Result<?> add(@RequestBody product product) {
        productMapper.save(product);
        return Result.success1("200", "商品添加成功",product);

    }

    @PostMapping({"/searchuser"})
    public Result<?> searchuser(@RequestBody product product) {

        return Result.success1("200", "查找成功",productMapper.findByusername(product.getUsername()));

    }


}
