package com.example.excellencesys.service;

import com.example.excellencesys.pojo.Commodity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品表 service
 */
public interface CommodityService {
    //根据商品类型id查询商品
    List<Commodity>  getgoodslist(int id);
    //根据商品名称搜索商品
    List<Commodity>  searchgoods(String name);
    //根据城市id查询商品
    List<Commodity> getgoods(int id);
    //根据商品 id 查询商品信息
    List<Commodity> getgoodsinfo(int id);
}
