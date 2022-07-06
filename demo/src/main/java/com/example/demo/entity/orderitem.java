package com.example.demo.entity;
import lombok.Data;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;

@Data
public class orderitem {
    private BigInteger id;
    private String username;
    private Integer orderid;
    private BigInteger productid;
    private String productName;
    private String productPicture;
    private String productpictureurl;
    private String categoryfirst;
    private String categorysecond;
    private double productPrice;
    private Integer quantity;
    private double totalprice;
    private String productdetails;
    private String orderstatus;


    public BigInteger getId() {
        return this.id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getuId() {
        return this.username;
    }
    public void setuId(String userid) {
        this.username = userid;
    }

    public Integer getoId() {
        return this.orderid;
    }
    public void setoId(Integer orderid) {
        this.orderid = orderid;
    }
}
