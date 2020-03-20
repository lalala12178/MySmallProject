package com.lalala.houtai.service;

import com.lalala.houtai.pojo.Order;

import java.util.List;

public interface OrderService {

    void insertOrderOne(Order order);
    Order selectOrderId(int id);
    List<Order> selectUsersAllFine();
    List<Order> selectUsersAllGo();
    void orderDel(int id);
    void updateOrder(Order order);
    int maxId();

}
