package com.example.excellencesys.controller;

import com.alibaba.fastjson.JSON;
import com.example.excellencesys.pojo.Address;
import com.example.excellencesys.pojo.User;
import com.example.excellencesys.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;


    /**
     * 登录
     * @param unumber
     * @param upass
     * @return
     */
    @RequestMapping("/login")
    public String login(String unumber, String upass){
        User user=userService.login(unumber,upass);
        if (user!=null){
            userService.updateState((int) user.getUid());
            return "login";
        }else {
            return  "index";
        }
    }


    /**
     * 注册
     * @param unumber
     * @param upass
     * @param code
     * @return
     */
    @RequestMapping("/regin")
    public String regin(String unumber, String upass,String code){
        Integer i=userService.regin(unumber,upass,code);
        if (i>0){
            return "index";
        }else {
            return  "regin";
        }
    }


    /**
     * 显示所有收货地址
     * @param uid
     * @return
     */
    @RequestMapping("/getAddressList")
    public String regin(Integer uid){
        List<Address> addresses=userService.getAddressList(uid);
        return JSON.toJSONString(addresses);
    }


    /**
     * 修改收货地址
     * @param address
     * @return
     */
    @RequestMapping("/updateAddress")
    public String updateAddress(Address address){
        Integer i=userService.updateAddress(address);
        if (i>0){
            return "getAddressList";
        }else {
            return "updateAddress";
        }

    }

    /**
     * 添加收货地址
     * @param address
     * @return
     */
    @RequestMapping("/addAddress")
    public String addAddress(Address address){
        Integer i=userService.addAddress(address);
        if (i>0){
            return "getAddressList";
        }else {
            return "addAddress";
        }

    }

    /**
     * 退出登录
     * @param uid
     * @return
     */
    @RequestMapping("/outLogin")
    public String outLogin(Integer uid){
        Integer i=userService.outLogin(uid);
        if (i>0){
            return "index";
        }else {
            return "index";
        }

    }

    /**
     * 个人信息展示
     * @param uid
     * @return
     */
    @RequestMapping("/getuserInfo")
    public String getuserInfo(Integer uid){
        User user=userService.getuserInfo(uid);
       return JSON.toJSONString(user);

    }

    /**
     * 余额查询
     * @param uid
     * @return
     */
    @RequestMapping("/getbalance")
    public Double getbalance(Integer uid){
        Double d=userService.getbalance(uid);
        return d;
    }


    /**
     *账户充值
     * @param uid
     * @return
     */
    @RequestMapping("/recharge")
    public String recharge(Integer uid,Double ubalance){
        Integer i=userService.recharge(uid,ubalance);
        if (i>0){
            return "getbalance";
        }else {
            return "recharge";
        }

    }








}
