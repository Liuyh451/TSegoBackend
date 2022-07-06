package com.example.demo.controller;
import com.example.demo.common.Result;
import com.example.demo.entity.User2;
import com.example.demo.mapper.User2Mapper;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.*;

import com.example.demo.util.CreateJwt;
import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class User2Controller {
    @Resource
    User2Mapper user2Mapper;


    @PostMapping({"/register"})
    public Result<?> save2(@RequestBody User2 user2) {
        String id = user2.getUsername();
        if (user2Mapper.findByusername(id) == null) {
            user2Mapper.save(user2);
            return Result.success("200", "注册成功");
        } else {
            return Result.error("409", "用户名已存在");
        }
    }

    @PostMapping({"/login"})
    public Result<?> save3(@RequestBody User2 user2) {
        String id1 = user2.getUsername();
        String id2 = user2.getPassword();
        String token=CreateJwt.getoken(user2);
        return this.user2Mapper.findBynamepassword(id1, id2) == null ? Result.error1("401",user2, "用户名或密码错误") : Result.success2("200", user2,"用户登录成功",token);
    }

    @PostMapping({"/password"})
    public Result<?> save6(@RequestBody password password) {
        Integer id = password.getId();
        String un = password.getUsername();
        String op = password.getoldpassword();
        String np = password.getnewpassword();
        if (this.user2Mapper.findBynamepassword(un, op) == null) {
            return Result.error("404", "密码错误");
        } else {
            user2Mapper.updateBypassword(password);
            return Result.success("200", "密码修改成功");
        }
    }

    @PostMapping({"/information"})
    public Result<?> save4(@RequestBody User2 user2) {
        String id = user2.getUsername();
        if (this.user2Mapper.findByusername(id) == null) {
            return Result.error1("404",user2, "用户名不存在");
        } else {
            return Result.success1("200", "用户信息返回成功",user2Mapper.findinformation(id));
        }
    }

    @PostMapping({"/information/modify"})
    public Result<?> save5(@RequestBody User2 user2) {
        String id = user2.getUsername();

            user2Mapper.save1(user2);
            return Result.success1("200", "用户个人信息修改成功",user2Mapper.findinformation(id));

    }

//    @PostMapping({"/information/adress"})
//    public Result<?> save6(@RequestBody User2 user2) {
//        String id = user2.getUsername();
//        user2Mapper.adresssave1(user2);
//        return Result.success1("200", "地址修改成功",user2Mapper.findinformationadress(id));
//
//    }
//
//    @PostMapping({"/adress"})
//    public Result<?> save7(@RequestBody User2 user2) {
//        String id = user2.getUsername();
//        if (this.user2Mapper.findByusernameadresss(id) == null) {
//            return Result.error1("404",user2, "用户名不存在");
//        } else {
//            return Result.success1("200", "用户信息返回成功",user2Mapper.findinformationadress(id));
//        }
//    }




}
