package com.example.excellencesys.dao;

import com.example.excellencesys.pojo.Shopping;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopDao {
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
