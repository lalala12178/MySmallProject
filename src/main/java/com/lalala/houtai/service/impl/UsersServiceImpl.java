package com.lalala.houtai.service.impl;


import com.lalala.houtai.mapper.UsersMapper;
import com.lalala.houtai.pojo.Role;
import com.lalala.houtai.service.UsersService;
import com.lalala.houtai.pojo.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional
public class UsersServiceImpl implements UsersService {

    @Resource
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users user) {
        this.usersMapper.insertUser(user);
    }

    @Override
    public Users login(Users user) {
        Users loginuser=new Users();

        loginuser=this.usersMapper.login(user);

        return loginuser;
    }

    @Override
    public List<Users> selectUsersAll() {

        return usersMapper.selectUsersAll();
    }

    @Override
    public Users selectUsersOne(Users user) {


        return usersMapper.selectUsersOne(user);
    }

    @Override
    public void insertUserAll(Users users) {

        usersMapper.insertUserAll(users);
    }

    @Override
    public void updateUser(Users users) {

        usersMapper.updateUser(users);

    }

    @Override
    public void delUser(Users users) {

        usersMapper.delUser(users);


    }

    @Override
    public Role roleName(Users users) {
        return usersMapper.roleName(users);
    }

    @Override
    public int maxId() {


        return usersMapper.maxId();
    }

    @Override
    public Users selectById(int id) {
        return usersMapper.selectById(id);
    }

    @Override
    public Users selectByName(Users users) {

        return usersMapper.selectByName(users);
    }

}

