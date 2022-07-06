package com.example.demo.entity;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;

@Data
public class comment {

    private Integer id;
    private String comment;
    private Integer userid;
    private String username;
    private String useravatar;
    private BigInteger productid;
    private String producturl;
    private String productname;
    private Date createtime;
    private String star;

}
