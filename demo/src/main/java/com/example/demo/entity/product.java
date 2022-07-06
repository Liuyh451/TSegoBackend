package com.example.demo.entity;
import lombok.Data;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;

@Data
public class product {
    private BigInteger id;
    private String categoryfirst;
    private String categorysecond;
    private String name;
    private String picture;
    private String pictureurl;
    private String pictureurltwo;
    private String pictureurlthree;
    private String pictureurlfour;
    private String originplace;
    private double price;
    private Integer stock;
    private String detail;
    private Boolean status;
    private Integer salesamount;
    private Date createtime;
    private Date updatetime;
    private double scrore;
    private Integer categoryid;
    private String username;


    public String getcategoryFirst() {
        return this.categoryfirst;
    }
    public BigInteger getId() {
        return this.id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }
    public void setcategoryFirst(String categoryfirst) {
        this.categoryfirst = categoryfirst;
    }

    public String getname() {return this.name;
    }
}
