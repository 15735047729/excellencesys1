package com.example.excellencesys.service.impl;

import com.example.excellencesys.dao.ShopDao;
import com.example.excellencesys.pojo.Shopping;
import com.example.excellencesys.service.ShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Resource
    ShopDao shopDao;


    @Override
    public List<Shopping> getshopcar(int comid) {
        return shopDao.getshopcar(comid);
    }

    @Override
    public int number(int oid) {
        return shopDao.number(oid);
    }


    @Override
    public double money(int oid) {
        return shopDao.money(oid);
    }
}
