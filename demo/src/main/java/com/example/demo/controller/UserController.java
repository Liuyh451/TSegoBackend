package com.example.demo.controller;
import com.example.demo.mapper.User1Mapper;
import com.example.demo.entity.User1;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user2")
public class UserController {

    @Resource
    User1Mapper user1Mapper;

//    @GetMapping
//    public List<user1> getUser() {
//        return user1Mapper.findAll();
//    }

    @PostMapping
    public String addUser(@RequestBody User1 user) {
        user1Mapper.save(user);
        return "success";
    }

    @PutMapping
    public String updateUser(@RequestBody User1 user) {
        user1Mapper.updateById(user);
        return "success";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        user1Mapper.deleteById(id);
        return "success";
    }

    @GetMapping("/{id}")
    public User1 findById(@PathVariable("id") Long id) {
        return user1Mapper.findById(id);
    }

//    @GetMapping("/page")
//    public Page<User> findByPage(@RequestParam(defaultValue = "1") Integer pageNum,
//                                 @RequestParam(defaultValue = "10") Integer pageSize) {
//        Integer offset = (pageNum - 1) * pageSize;
//        List<User> userData = userMapper.findByPage(offset, pageSize);
//        Page<User> page = new Page<>();
//        page.setData(userData);
//
//        Integer total = userMapper.countUser();
//        page.setTotal(total);
//        page.setPageNum(pageNum);
//        page.setPageSize(pageSize);
//        return page;
//    }

}
