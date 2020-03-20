package com.lalala.houtai.mapper;

import com.lalala.houtai.pojo.Order;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    void insertOrderOne(Order order);
    Order selectOrderId(int id);
    List<Order> selectUsersAllFine();
    List<Order> selectUsersAllGo();
    void orderDel(int id);
    void updateOrder(Order order);
    int maxId();
}
