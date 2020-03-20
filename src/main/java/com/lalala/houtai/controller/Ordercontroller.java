package com.lalala.houtai.controller;


import com.lalala.houtai.pojo.Order;
import com.lalala.houtai.pojo.Users;
import com.lalala.houtai.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
//订单处理
@Controller
@RequestMapping("/order")
public class Ordercontroller {
    @Autowired
    OrderService orderService;

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
//未完成订单
    @RequestMapping("/orderManagementGo")
    public String orderManagementGo(Model model){
        List<Order> listRole=this.orderService.selectUsersAllGo();


        model.addAttribute("listRole",listRole);
        return "orderManagementGo";
    }
    //已完成订单
    @RequestMapping("/orderManagementFine")
    public String orderManagementFine(Model model){
        List<Order> listRole=this.orderService.selectUsersAllFine();


        model.addAttribute("listRole",listRole);
        return "orderManagementFine";
    }
    //订单改变
    @RequestMapping("/orderSheetChange")
    @ResponseBody
    public Order ordersheetChange(Order order){
        System.out.println("one:    "+order);



        if (order.getId()!=0){
            orderService.updateOrder(order);
            order=orderService.selectOrderId(order.getId());
        }else {
            if (order.getOrderName()==null||order.getOrderName()==""){
                return order;
            }
            orderService.insertOrderOne(order);
            order.setId(orderService.maxId());
            order=orderService.selectOrderId(order.getId());
            System.out.println(order);
        }

        return order;
    }
    //删除
    @RequestMapping("/delUser")
    @ResponseBody
    public void delUser(Order order){
        System.out.println(order);
        orderService.orderDel(order.getId());


    }


}
