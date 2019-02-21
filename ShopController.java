package com.example.excellencesys.controller;


import com.example.excellencesys.pojo.Shopping;
import com.example.excellencesys.service.ShopService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

@RestController
@Api(tags = "购物车")
public class ShopController {

    @Autowired
    ShopService shopService;

    /**
     * 查询购物车信息
     * @param uid
     * @return
     */
    @ApiOperation(value = "查询购物车")
    @ApiResponses({@ApiResponse(code = 1,message="操作成功"),
            @ApiResponse(code = 0,message = "操作失败，服务器内部异常"),
            @ApiResponse(code = 303,message = "权限不足")})
    @RequestMapping(value = "/getshopcar}", method = RequestMethod.GET)
    public List car(int uid){
        List<Shopping>shoppingList=shopService.getshopcar(uid);

        return shopService.getshopcar(uid) ;

    }

    /**
     * 商品数量
     * @param oid
     * @return
     */
    @ApiOperation(value = "查询商品数量")
    @ApiResponses({@ApiResponse(code = 1,message="操作成功"),
            @ApiResponse(code = 0,message = "操作失败，服务器内部异常"),
            @ApiResponse(code = 303,message = "权限不足")})
    @RequestMapping(value = "/number", method = RequestMethod.GET)
    public int number(int oid){
        return shopService.number(oid);
    }

    /**
     * 查询商品总价
     * @param oid
     * @return
     */
    @ApiOperation(value = "商品总价")
    @ApiResponses({@ApiResponse(code = 1,message="操作成功"),
            @ApiResponse(code = 0,message = "操作失败，服务器内部异常"),
            @ApiResponse(code = 303,message = "权限不足")})
    @RequestMapping(value = "/money", method = RequestMethod.GET)
    public Double choose(int oid){
        return shopService.money(oid);
    }


}
