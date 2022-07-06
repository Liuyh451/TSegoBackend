package com.example.demo.entity;
import lombok.Data;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;

@Data
public class adress {
    private Integer id;
    private String username;
    private String address;
    private String province;
    private String phone;
    private String city;
    private String district;
    private String name;
}
