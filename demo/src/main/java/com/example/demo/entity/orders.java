package com.example.demo.entity;
import com.example.demo.entity.orderitem;

import java.math.BigInteger;
import java.util.List;
public class orders {
    public List<orderitem> orderItem;
    public Integer orderId;
    public String orderStatus;
    public String username;
    public double orderPaymentMoney;
    public void setOrderItem(List<orderitem> orderItem) {
        this.orderItem = orderItem;
    }
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public void setOrderStatus(String orderStatus){this.orderStatus=orderStatus;}
    public void setOrderPaymentMoney(double orderPaymentMoney){this.orderPaymentMoney=orderPaymentMoney;}
    public void setUsername(String username){this.username=username;}
}
