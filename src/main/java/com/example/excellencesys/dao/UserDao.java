package com.example.excellencesys.dao;

import com.example.excellencesys.pojo.Address;
import com.example.excellencesys.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    User login(String unumber, String upass);//登录
    Integer updateState(Integer uid);//修改登录状态
    Integer regin(String unumber,String upass,String code);//注册
    Integer outLogin(Integer uid);//退出（默认0为退出）
    User getuserInfo(@Param("uid") Integer uid);//个人信息展示
    Integer recharge(Integer uid,Double ubalance);//账号充值
}
