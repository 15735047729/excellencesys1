package com.example.excellencesys.service;

import com.example.excellencesys.pojo.Shopping;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ShopService {
    /**
     * 查询购物车
     * @return
     */
    List<Shopping> getshopcar(@Param("uid") int uid);


    //查询商品数量
    int number(@Param("oid") int oid);


    //商品总价
    double money(@Param("oid") int oid);

}
