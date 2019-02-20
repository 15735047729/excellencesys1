package com.example.excellencesys.service.impl;

import com.example.excellencesys.dao.UserDao;
import com.example.excellencesys.pojo.Address;
import com.example.excellencesys.pojo.User;
import com.example.excellencesys.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;


    @Override
    public User login(String unumber, String upass) {
        return userDao.login(unumber,upass);
    }

    @Override
    public Integer updateState(Integer uid) {
        return userDao.updateState(uid);
    }

    @Override
    public Integer regin(String unumber, String upass, String code) {
        return userDao.regin(unumber,upass,code);
    }

    @Override
    public Integer outLogin(Integer uid) {
        return userDao.outLogin(uid);
    }

    @Override
    public User getuserInfo(Integer uid) {
        return userDao.getuserInfo(uid);
    }

    @Override
    public Integer recharge(Integer uid,Double ubalance) {
        return userDao.recharge(uid,ubalance);
    }
}
