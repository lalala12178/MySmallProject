package com.lalala.houtai.pojo;

import java.util.List;

public class Users {
    int id;
    String username;
    String password;
    int income;
    int rid;
    String roles;

    public Users(int id, String username, String password, int income, int rid, String roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.income = income;
        this.rid = rid;
        this.roles = roles;
    }

    public Users() {
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", income=" + income +
                ", rid=" + rid +
                ", roles=" + roles +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
