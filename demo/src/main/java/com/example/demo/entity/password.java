package com.example.demo.entity;

public class password {
    private Integer id;
    private String username;
    private String oldpassword;
    private String newpassword;

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

    public String getoldpassword() {
        return this.oldpassword;
    }

    public void setoldPassword(String oldpassword) {
        this.oldpassword = oldpassword;
    }

    public String getnewpassword() {return this.oldpassword; }

    public void setnewPassword(String newpassword) {
        this.newpassword = newpassword;
    }


}
