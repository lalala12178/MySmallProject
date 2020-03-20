package com.lalala.houtai.pojo;

import java.util.Date;

public class Order {
    int id;
    String orderName;
    String orderDate;
    int quantity;
    String operator;
    int state;

    public Order(int id, String orderName, String orderDate, int quantity, String operator, int state) {
        this.id = id;
        this.orderName = orderName;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.operator = operator;
        this.state = state;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderName='" + orderName + '\'' +
                ", orderDate=" + orderDate +
                ", quantity=" + quantity +
                ", operator='" + operator + '\'' +
                ", state=" + state +
                '}';
    }
}
