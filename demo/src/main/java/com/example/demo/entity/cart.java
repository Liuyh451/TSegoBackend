package com.example.demo.entity;
import lombok.Data;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;

@Data
public class cart {
    private Integer id;
    private Integer x;
    private Integer userid;
    private Integer productid;
    private String productname;
    private String productpicture;
    private double oldprice;
    private double currentprice;
    private Integer quantity;
    private double lowestprice;
    private Boolean status;
    private Date createtime;
    private Date updatetime;
    private Boolean notify;

    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return this.productid;
    }
    public void setpId(Integer productid) {
        this.productid = productid;
    }


}

