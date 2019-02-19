package com.example.excellencesys.service;

import com.example.excellencesys.pojo.Address;
import com.example.excellencesys.pojo.User;

import java.util.List;

public interface UserService {
    User login(String unumber, String upass);//登录
    Integer updateState(Integer uid);//修改登录状态
    Integer regin(String unumber,String upass,String code);//注册
    List<Address> getAddressList(Integer uid);//显示收货地址列表
    Integer updateAddress(Address address);//修改收货地址
    Integer addAddress(Address address);//添加收货地址
    Integer outLogin(Integer uid);//退出（默认0为退出）
    User getuserInfo(Integer uid);//个人信息展示
    Double getbalance(Integer uid);//余额查询
    Integer recharge(Integer uid,Double ubalance);//账号充值
}
