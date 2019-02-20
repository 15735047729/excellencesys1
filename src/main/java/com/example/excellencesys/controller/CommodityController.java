package com.example.excellencesys.controller;


import com.alibaba.fastjson.JSON;
import com.example.excellencesys.pojo.Commodity;
import com.example.excellencesys.service.CommodityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/CommContro")
@Api(value = "CommodityController|商品类控制器")
public class CommodityController {

    @Resource(name = "commodityService")
    CommodityService service;


    /**
     * 根据商品类型id查询商品
     * @param id
     * @return
     */
    @ApiOperation(value =  "根据商品类型id查询商品" )
    @ApiImplicitParam(paramType = "query",name = "id",value = "商品类型id",required = true,dataType = "int")
    @RequestMapping(value = "/goodslist",method = RequestMethod.GET)
    public String   getgoodslist(@RequestParam int id){
        List<Commodity> list= service.getgoodslist(id);
        return JSON.toJSONString(list);
    }

    /**
     * 根据商品名称查询商品
     * @param name
     * @return
     */
    @ApiOperation(value =  "根据商品名称查询商品" )
    @ApiImplicitParam(paramType = "query",name = "name",value = "商品名称",required = true,dataType = "String")
    @RequestMapping(value = "/searchgoods",method = RequestMethod.GET)
    public String searchgoods(@RequestParam String name){
        List<Commodity> list= service.searchgoods(name);
        return  JSON.toJSONString(list);
    }

    /**
     * 根据城市id查询商品
     */
    public String getgoods(int id){
        List<Commodity> list=service.getgoods(id);
        return JSON.toJSONString(list);
    }

    /**
     * 根据商品id查询商品
     * @param id
     * @return
     */
    @ApiOperation(value =  "根据商品id查询商品" )
    @ApiImplicitParam(paramType = "query",name = "id",value = "商品id",required = true,dataType = "int")
    @RequestMapping(value = "/getgoodinfo",method = RequestMethod.GET)
    public String getgoodsinfo(@RequestParam int id){
        List<Commodity> list=service.getgoodsinfo(id);
        return JSON.toJSONString(list);
    }


}
