package com.example.demo.controller;
import com.example.demo.common.Result;
import com.example.demo.entity.adress;
import com.example.demo.mapper.User2Mapper;
import com.example.demo.mapper.adressMapper;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.*;

import com.example.demo.util.CreateJwt;
import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping("/adress")
public class adressController {
    @Resource
    adressMapper adressMapper;

    @PostMapping({"/information"})
    public Result<?> save(@RequestBody adress adress) {
        String id = adress.getUsername();
        return Result.success1("200", "用户地址信息返回成功",adressMapper.findByusername(id));

    }
    @PostMapping({"/information/modify"})
    public Result<?> save5(@RequestBody adress adress) {
        String id = adress.getUsername();
        adressMapper.saveadress(adress);
        return Result.success1("200", "用户地址修改成功",adressMapper.findByusername(id));

    }
    @PostMapping({"/add"})
    public Result<?> save6(@RequestBody adress adress) {
        adressMapper.save(adress);
        return Result.success1("200", "用户地址增加成功",adress);

    }

}
