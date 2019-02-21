package com.example.excellencesys.controller;

import com.alibaba.fastjson.JSON;
import com.example.excellencesys.dao.AddressDao;
import com.example.excellencesys.pojo.Address;
import com.example.excellencesys.service.AddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "住址信息1")
@RequestMapping("/user")
public class AddressController {
    @Resource
    private AddressService addressService;

    /**
     * 添加收货地址
     * @param address
     * @return
     */
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "address", value = "住址信息", required = true, dataType = "String"),
                    @ApiImplicitParam(name = "uid", value = "用户id", required = true, dataType = "int")
            })
    @ApiOperation(value = "添加用户地址信息", notes = "根据url的name和url的password获得请求参数的字符串相加，RestFul风格的请求")
    @RequestMapping(value = "/addAddress",method = RequestMethod.POST)
    public String addAddress(String address,Integer uid){
        return JSON.toJSONString(addressService.addAddress(address,uid));
    }


    /**
     * 修改收货地址
     * @param address
     * @return
     */
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "address", value = "住址信息", required = true, dataType = "String"),
                    @ApiImplicitParam(name = "addid", value = "住址id", required = true, dataType = "int")
            })
    @ApiOperation(value = "修改用户地址信息", notes = "根据url的name和url的password获得请求参数的字符串相加，RestFul风格的请求")
    @RequestMapping(value = "/updateAddress",method = RequestMethod.POST)
    public String updateAddress(String address,Integer addid){
        return JSON.toJSONString(addressService.updateAddress(address,addid));
    }


    /**
     * 显示所有收货地址
     * @param uid
     * @return
     */
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "uid", value = "用户id", required = true, dataType = "String"),
            })
    @ApiOperation(value = "根据用户id查询所有收货地址信息", notes = "根据url的name和url的password获得请求参数的字符串相加，RestFul风格的请求")
    @RequestMapping(value = "/getAddressList",method = RequestMethod.GET)
    public String regin(Integer uid){
        List<Address> addresses=addressService.getAddressList(uid);
        return JSON.toJSONString(addresses);
    }


    /**
     * 删除用户收货地址
     * @param addid
     * @return
     */
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "addid", value = "地址id", required = true, dataType = "int"),
            })
    @ApiOperation(value = "根据地址id删除收货地址信息", notes = "根据url的name和url的password获得请求参数的字符串相加，RestFul风格的请求")
    @RequestMapping(value = "/delAddress",method = RequestMethod.GET)
    public String delAddress(Integer addid){
        Integer i=addressService.delAddress(addid);
        return JSON.toJSONString(i);
    }
}
