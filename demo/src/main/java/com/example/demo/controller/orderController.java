package com.example.demo.controller;
import com.example.demo.common.Result;
import com.example.demo.entity.*;
import com.example.demo.mapper.orderMapper;
import org.springframework.web.bind.annotation.*;
import com.example.demo.mapper.productMapper;
import javax.annotation.Resource;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class orderController {
    @Resource
    orderMapper orderMapper;
    productMapper productMapper;

    @PostMapping({"/all/information"})
    public Result<?> search(@RequestBody orderitem orderitem) {
        orderss orders=new orderss();
        orders order = new orders();
        String zjhstatus="1";
        order.setOrderItem(orderMapper.findByuserId(orderitem.getUsername(),zjhstatus));
        List<orderitem> product=order.orderItem;
        double sum=0;
        for (orderitem orderitem1:product){
            sum=sum+orderitem1.getQuantity()*orderitem1.getProductPrice();
            order.setOrderId(orderitem1.getOrderid());
            order.setOrderStatus(orderitem1.getOrderstatus());
           }
        order.setOrderPaymentMoney(sum);
        orders.setOrderItem(order);
        return Result.success1("200", "订单信息获取成功", orders);

    }

    @PostMapping({"/all/information/order/buyer"})
    public Result<?> search12(@RequestBody orderitem orderitem) {
        ordersss orderss=new ordersss();
        orders order = new orders();
        order.setOrderItem(orderMapper.findByuser(orderitem.getUsername()));
        Integer a=0,b=0;
        double sum;
        List<orders> ordersList= new ArrayList<>();
        List<orderitem> product=order.orderItem;
        for (orderitem orderitem2:product){
            a=orderitem2.getOrderid();
            if(a!=b){
                orders order1=new orders();
                order1.setOrderItem(orderMapper.findByorder(a));
                List<orderitem> product1=order1.orderItem;
                sum=0;
                for (orderitem orderitem1:product1){
                    sum=sum+orderitem1.getQuantity()*orderitem1.getProductPrice();
                    order1.setOrderId(orderitem1.getOrderid());
                    order1.setOrderStatus(orderitem1.getOrderstatus());
                }
                order1.setOrderPaymentMoney(sum);
                order1.setOrderItem(product1);
                ordersList.add(order1);
            }
            b=a;
        }
        orderss.setOrderItem(ordersList);
        return Result.success1("200", "订单信息获取成功", orderss);

    }

    @PostMapping({"/all/information/order/seller"})
    public Result<?> search21(@RequestBody orderitem orderitem) {
        ordersss orderss=new ordersss();
        orders orderz = new orders();
        String zjhstatus="1";
        orderz.setOrderItem(orderMapper.findByseller(zjhstatus));
        Integer a=0,b=0;
        double sum;
        List<orders> ordersList= new ArrayList<>();
        List<orderitem> product=orderz.orderItem;
        for (orderitem orderitem2:product){
            a=orderitem2.getOrderid();
            if(a!=b){
                orders order1=new orders();
                order1.setOrderItem(orderMapper.findBysellerid(a,zjhstatus));
                List<orderitem> product1=order1.orderItem;
                sum=0;
                for (orderitem orderitem1:product1){
                    sum=sum+orderitem1.getQuantity()*orderitem1.getProductPrice();

                    order1.setOrderId(orderitem1.getOrderid());
                    order1.setOrderStatus(orderitem1.getOrderstatus());
                    order1.setUsername(orderitem1.getUsername());
                }
                order1.setOrderPaymentMoney(sum);
                order1.setOrderItem(product1);
                ordersList.add(order1);
            }
            b=a;
        }
        orderss.setOrderItem(ordersList);
        return Result.success1("200", "订单信息获取成功", orderss);

    }

    @PostMapping({"/all/information/order/status"})
    public Result<?> search211(@RequestBody orderitem orderitem) {
        ordersss orderss=new ordersss();
        orders order = new orders();
        String zjhstatus="2";
        order.setOrderItem(orderMapper.findBystatus(zjhstatus));
        Integer a=0,b=0;
        double sum;
        List<orders> ordersList= new ArrayList<>();
        List<orderitem> product=order.orderItem;
        for (orderitem orderitem2:product){
            a=orderitem2.getOrderid();
            if(a!=b){
                orders order1=new orders();
                order1.setOrderItem(orderMapper.findByorderId(a,zjhstatus));
                List<orderitem> product1=order1.orderItem;
                sum=0;
                for (orderitem orderitem1:product1){
                    sum=sum+orderitem1.getQuantity()*orderitem1.getProductPrice();
                    order1.setOrderId(orderitem1.getOrderid());
                    order1.setOrderStatus(orderitem1.getOrderstatus());
                }
                order1.setOrderPaymentMoney(sum);
                order1.setOrderItem(product1);
                ordersList.add(order1);
            }
            b=a;
        }
        orderss.setOrderItem(ordersList);
        return Result.success1("200", "订单信息获取成功", orderss);

    }

    @PostMapping({"/allsum"})
    public Result<?> search2111(@RequestBody orderitem orderitem) {
        ordersss orderss=new ordersss();
        orders order = new orders();
        String zjhstatus="3";
        order.setOrderItem(orderMapper.findBystatus(zjhstatus));
        Integer a=0,b=0;
        double sum=0;
        List<orders> ordersList= new ArrayList<>();
        List<orderitem> product=order.orderItem;
        for (orderitem orderitem2:product){
            a=orderitem2.getOrderid();
            if(a!=b){
                orders order1=new orders();
                order1.setOrderItem(orderMapper.findByorderId(a,zjhstatus));
                List<orderitem> product1=order1.orderItem;
                for (orderitem orderitem1:product1){
                    sum=sum+orderitem1.getQuantity()*orderitem1.getProductPrice();
                    order1.setOrderId(orderitem1.getOrderid());
                    order1.setOrderStatus(orderitem1.getOrderstatus());
                }

            }
            b=a;
        }

        return Result.success1("200", "订单信息获取成功", sum);

    }
    @PostMapping({"/allsum/buyer"})
    public Result<?> search10(@RequestBody orderitem orderitem) {
        ordersss orderss=new ordersss();
        orders order = new orders();
        order.setOrderItem(orderMapper.findByuser(orderitem.getUsername()));
        Integer a=0,b=0;
        double sum=0;
        List<orders> ordersList= new ArrayList<>();
        List<orderitem> product=order.orderItem;
        for (orderitem orderitem2:product){
            a=orderitem2.getOrderid();
            if(a!=b){
                orders order1=new orders();
                order1.setOrderItem(orderMapper.findByorder(a));
                List<orderitem> product1=order1.orderItem;
                for (orderitem orderitem1:product1){
                    sum=sum+orderitem1.getQuantity()*orderitem1.getProductPrice();
                    order1.setOrderId(orderitem1.getOrderid());
                    order1.setOrderStatus(orderitem1.getOrderstatus());
                }
                order1.setOrderPaymentMoney(sum);
                order1.setOrderItem(product1);
                ordersList.add(order1);
            }
            b=a;
        }
        orderss.setOrderItem(ordersList);
        return Result.success1("200", "订单信息获取成功", sum);

    }
    @PostMapping({"/selectusercount"})
    public Result<?> select1(@RequestBody orderitem orderitem) {
        species species=new species();
        String username=orderitem.getUsername();
        species.seta(orderMapper.findusercount("护肤彩妆",username));
        species.setB(orderMapper.findusercount("百货市场",username));
        species.setC(orderMapper.findusercount("服饰箱包",username));
        species.setD(orderMapper.findusercount("汇吃美食",username));
        species.setE(orderMapper.findusercount("电子数码",username));
        return Result.success1("200", "成功",species);

    }
    @PostMapping({"/delete"})
    public Result<?> delete(@RequestBody orderitem orderitem) {
        orderMapper.delete(orderitem);
        return Result.success("200", "商品删除成功");

    }

    @PostMapping({"/change"})
    public Result<?> change(@RequestBody orderitem orderitem) {
        String orderstatus="3";
        orderMapper.change(orderitem.getOrderid(),orderstatus);
        return Result.success("200", "商品状态修改成功");

    }

    @PostMapping({"/add"})
    public Result<?> save(@RequestBody orderitem orderitem) {
        orderMapper.save(orderitem);
        return Result.success("200", "订单创建成功");

    }

    @PostMapping({"/selectcount"})
    public Result<?> select() {
        species species=new species();
        species.seta(orderMapper.findcount("护肤彩妆"));
        species.setB(orderMapper.findcount("百货市场"));
        species.setC(orderMapper.findcount("服饰箱包"));
        species.setD(orderMapper.findcount("汇吃美食"));
        species.setE(orderMapper.findcount("电子数码"));
        return Result.success1("200", "成功",species);

    }


    @PostMapping({"/generation"})
    public Result<?> save1(@RequestBody muchorder muchorder) {
        int b =new Random().nextInt(100 - 3 + 1) + 3;
        List<orderitem> product=muchorder.product;
        for (orderitem orderitem:product){
            orderitem.setUsername(muchorder.getusername());
            orderitem.setOrderid(b);
            String a="1";
            orderitem.setOrderstatus(a);
            orderMapper.save(orderitem);}
        return Result.success("200", "订单创建成功");

    }


    @PostMapping({"/information"})
    public Result<?> search1(@RequestBody orderitem orderitem) {
        orderss orders=new orderss();
        orders order = new orders();
        order.setOrderItem(orderMapper.findByorder(orderitem.getOrderid()));
        List<orderitem> product=order.orderItem;
        double sum=0;
        for (orderitem orderitem1:product){
            sum=sum+orderitem1.getQuantity()*orderitem1.getProductPrice();
            order.setOrderId(orderitem1.getOrderid());
            order.setOrderStatus(orderitem1.getOrderstatus());
        }
        order.setOrderPaymentMoney(sum);
        orders.setOrderItem(order);
        return Result.success1("200", "订单信息获取成功", orders);

    }


    @PostMapping({"/pay"})
    public Result<?> pay(@RequestBody orderitem orderitem) {
        Integer id=orderitem.getOrderid();
        String a="2";
        orderMapper.pay(a,id);
        return Result.success("200","支付成功");

    }



}
