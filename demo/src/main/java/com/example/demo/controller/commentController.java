package com.example.demo.controller;
import com.example.demo.common.Result;
import com.example.demo.entity.comment;
import com.example.demo.mapper.commentMapper;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.*;

import com.example.demo.util.CreateJwt;
import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping("/comment")
public class commentController {
    @Resource
    commentMapper commentMapper;

    @PostMapping({"/user"})
    public Result<?> search1(@RequestBody comment comment) {
        String id = comment.getUsername();
        return Result.success1("200", "用户评论信息返回成功",commentMapper.findByusername(id));

    }

    @PostMapping({"/add"})
    public Result<?> add(@RequestBody comment comment) {
        commentMapper.save(comment);
        return Result.success("200", "用户评论信息添加成功");

    }

    @PostMapping({"/product"})
    public Result<?> search2(@RequestBody comment comment) {
        return Result.success1("200", "商品评论信息返回成功",commentMapper.findByproductid(comment.getProductid()));

    }
}
