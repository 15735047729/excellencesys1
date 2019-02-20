package com.example.excellencesys.service.impl;

import com.example.excellencesys.dao.CommodityDao;
import com.example.excellencesys.pojo.Commodity;
import com.example.excellencesys.service.CommodityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品表   serviceimpl
 */
@Service("commodityService")
public class CommodityServiceImpl implements CommodityService {

    @Resource
    CommodityDao dao;


    //根据商品类型id查询商品
    public List<Commodity> getgoodslist(int id) {
        return dao.getgoodslist(id);
    }

    //根据商品名称搜索商品
    public List<Commodity> searchgoods(String name) {
        return dao.searchgoods(name);
    }

    //根据城市id查询商品
    public List<Commodity> getgoods(int id) {
        return dao.getgoods(id);
    }

    //根据商品id查询商品
    public List<Commodity> getgoodsinfo(int id) {
        return dao.getgoodsinfo(id);
    }


}
