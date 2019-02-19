package com.example.excellencesys.controller;

import com.alibaba.fastjson.JSON;
import com.example.excellencesys.dao.AddressDao;
import com.example.excellencesys.pojo.Address;
import com.example.excellencesys.service.AddressService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
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
            })
    @ApiOperation(value = "添加用户地址信息", notes = "根据url的name和url的password获得请求参数的字符串相加，RestFul风格的请求")
    @RequestMapping(value = "/addAddress",method = RequestMethod.GET)
    public String addAddress(Address address){
        return JSON.toJSONString(addressService.addAddress(address));
    }


    /**
     * 修改收货地址
     * @param address
     * @return
     */
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "address", value = "住址信息", required = true, dataType = "String"),
            })
    @ApiOperation(value = "修改用户地址信息", notes = "根据url的name和url的password获得请求参数的字符串相加，RestFul风格的请求")
    @RequestMapping("/updateAddress")
    public String updateAddress(Address address){
        return JSON.toJSONString(addressService.updateAddress(address));
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
    @RequestMapping("/getAddressList")
    public String regin(Integer uid){
        List<Address> addresses=addressService.getAddressList(uid);
        return JSON.toJSONString(addresses);
    }
}
