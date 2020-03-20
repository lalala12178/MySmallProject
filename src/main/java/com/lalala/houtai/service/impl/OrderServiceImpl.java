package com.lalala.houtai.service.impl;

import com.lalala.houtai.mapper.OrderMapper;
import com.lalala.houtai.pojo.Order;
import com.lalala.houtai.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{

    @Resource
    @Autowired
    OrderMapper orderMapper;

    @Override
    public void insertOrderOne(Order order) {
        orderMapper.insertOrderOne(order);
    }

    @Override
    public Order selectOrderId(int id) {

        return orderMapper.selectOrderId(id);
    }

    @Override
    public List<Order> selectUsersAllFine() {
        return orderMapper.selectUsersAllFine();
    }

    @Override
    public List<Order> selectUsersAllGo() {
        return orderMapper.selectUsersAllGo();
    }

    @Override
    public void orderDel(int id) {
        orderMapper.orderDel(id);
    }

    @Override
    public void updateOrder(Order order) {
        orderMapper.updateOrder(order);
    }

    @Override
    public int maxId() {
        return orderMapper.maxId();
    }
}
