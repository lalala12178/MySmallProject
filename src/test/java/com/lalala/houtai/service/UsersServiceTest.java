package com.lalala.houtai.service;

import com.lalala.houtai.HoutaiApplication;
import com.lalala.houtai.pojo.Order;
import com.lalala.houtai.pojo.Users;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(classes = HoutaiApplication.class)
class UsersServiceTest {
    @Autowired
    private UsersService usersService;
    @Resource
    private OrderService orderService;
    @BeforeEach
    void setUp() {
    }

    @Test

    void test(){

        System.out.println(usersService.maxId());

    }
    @Test
    void test01(){
        Order order=new Order();
        order.setOperator("bbb");
        order.setQuantity(400);
        order.setOrderName("IPhone");
        order.setState(1);

        orderService.insertOrderOne(order);
    }
    @Test
    void test02(){

        Users users=new Users();
        users.setUsername("yyy");

        System.out.println(usersService.selectByName(users));
    }
    @Test
    void test03(){
        Order order=new Order();
        order.setOperator("fff");
        order.setQuantity(600);
        order.setOrderName("IPhone");
        order.setState(2);
        order.setId(4);

        orderService.updateOrder(order);
    }


    @AfterEach
    void tearDown() {
    }
}