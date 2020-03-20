package com.lalala.houtai.service;
import com.lalala.houtai.pojo.Role;
import com.lalala.houtai.pojo.Users;
import java.util.List;

public interface UsersService {

    void addUser(Users user);
    Users login(Users user);
    List<Users> selectUsersAll();
    Users selectUsersOne(Users users);
    void insertUserAll(Users users);
    void updateUser (Users users);
    void delUser(Users users);
    Role roleName(Users users);
    int maxId();
    Users selectById(int id);
    Users selectByName(Users users);
}
