package com.example.excellencesys.dao;

import com.example.excellencesys.pojo.Address;
import com.example.excellencesys.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    User login(@Param("unumber") String unumber,@Param("upass") String upass);//登录
    Integer updateState(@Param("uid") Integer uid);//修改登录状态
    Integer regin(@Param("unumber") String unumber,@Param("upass") String upass,@Param("code") String code);//注册
    Integer outLogin(@Param("uid") Integer uid);//退出（默认0为退出）
    User getuserInfo(@Param("uid") Integer uid);//个人信息展示
    Integer recharge(@Param("uid") Integer uid,@Param("ubalance")  Double ubalance);//账号充值
}
