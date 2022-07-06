package com.example.demo.entity;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class User2 {

    private Integer id;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private String gender;
    private String phone;
    private Integer age;
    private String signature;
    private Boolean status;
    private String identity;
    private Date createtime;
    private String userurl;


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
