package com.example.demo.entity;
import lombok.Data;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;

@Data
public class order {
    private Integer id;
    private Integer orderid;
    private Integer userid;
    private Integer receiverid;
    private String receivername;
    private String receiveaddress;
    private Integer itemcount;
    private Boolean status;
    private double paymentmoney;
    private String paymenttype;
    private Date peymenttime;
    private Date sendtime;
    private Date createtime;
    private Date completetime;

    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuId() {
        return this.userid;
    }
    public void setuId(Integer productid) {
        this.userid = userid;
    }



}
