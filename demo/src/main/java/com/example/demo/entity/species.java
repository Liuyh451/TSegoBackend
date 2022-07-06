package com.example.demo.entity;
import lombok.Data;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;

@Data
public class species {
    Integer a;
    Integer b;
    Integer c;
    Integer d;
    Integer e;
    Integer f;

    public Integer geta() {
        return this.a;
    }
    public void seta(Integer id) {
        this.a = id;
    }
}
