package com.lalala.houtai.controller;

import com.lalala.houtai.pojo.Role;
import com.lalala.houtai.service.UsersService;
import com.lalala.houtai.pojo.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UsersService usersService;


    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

    //注册
    @RequestMapping("/addUser")
    public String addUser(Users user){
        System.out.println(user);
        user.setIncome(4000);
        this.usersService.addUser(user);
        return "login";
    }

    //登陆
    @RequestMapping("/loginAction")
    public String userLogin(Users users, HttpServletRequest request) {

        Role userRole;
        System.out.println(users);
        Users loginUser=this.usersService.login(users);
        System.out.println(loginUser);
        userRole= usersService.roleName(loginUser);
        if (loginUser != null) {
            HttpSession session = request.getSession();//获取session并将username存入session对象
            session.setAttribute("username",users.getUsername());
            session.setAttribute("userRole",userRole.getRoleName());
            session.setAttribute("ChiRole",userRole.getChiRole());
            return "index";
        }

        return "redirect:login";

    }
    //权限管理
    @RequestMapping("/humanAffairsRole")
    public String humanAffairsRole(Model model){
        List<Users> listRole=this.usersService.selectUsersAll();


        model.addAttribute("listRole",listRole);
        return "humanAffairsRole";
    }
    //收入管理
    @RequestMapping("/humanAffairsMoney")
    public String humanAffairsMoney(Model model){
        List<Users> listRole=this.usersService.selectUsersAll();

        for (Users temp:listRole){
            temp.setRoles(usersService.roleName(temp).getChiRole());
        };


//        System.out.println(listRole);
        model.addAttribute("listRole",listRole);
        return "humanAffairsMoney";
    }
    //权限改变
    @RequestMapping("/orderChange")
    @ResponseBody
    public Users orderChange(Users users){

        if(users.getId()>4||users.getId()<1){
            users.setRid(4);
        }

        if (users.getId()!=0){
            users.setIncome(usersService.selectById(users.getId()).getIncome());

            usersService.updateUser(users);
            System.out.println(users);
        }else {
            users.setIncome(4000);
            usersService.insertUserAll(users);
        }
//        System.out.println(users);

        return users;
    }

    //收入改变
    @RequestMapping("/orderMoney")
    @ResponseBody
    public Users orderMoney(Users users){



        if (users.getId()!=0){
            users.setPassword(usersService.selectById(users.getId()).getPassword());
            users.setRid(usersService.selectById(users.getId()).getRid());
            System.out.println(usersService.selectById(users.getId()));
            System.out.println(users);
           usersService.updateUser(users);
        }else {
            users.setRid(4);
            users.setPassword("111");
            usersService.insertUserAll(users);
            users.setId(usersService.maxId());
        }
        System.out.println(users);
        return users;
    }
//    用户删除
    @RequestMapping("/delUser")
    @ResponseBody
    public void delUser(Users users){
        System.out.println(users);
        usersService.delUser(users);


    }

    @RequestMapping("/selectByName")
    @ResponseBody
    public int selectByName(Users users){
        System.out.println(users);

        if (usersService.selectByName(users)==null){
            return 0;

        }
        else {
            return 1;
        }



    }




}
