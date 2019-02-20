package com.example.excellencesys.dao;

import com.example.excellencesys.pojo.Commodity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品表  dao
 */
public interface CommodityDao {
    //根据商品类型id查询商品
    List<Commodity> getgoodslist(@Param(value = "tid") int id);
    //搜索商品
    List<Commodity> searchgoods(@Param(value = "name") String name);
    //根据城市id查询商品
    List<Commodity> getgoods(@Param(value = "cid") int id);
    //根据商品 id 查询商品信息
    List<Commodity> getgoodsinfo(@Param(value = "comid") int id);

}
