package com.example.excellencesys.controller;

import com.alibaba.fastjson.JSON;
import com.example.excellencesys.pojo.Address;
import com.example.excellencesys.pojo.User;
import com.example.excellencesys.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(tags = "swagger初学Demo")
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 登录
     * @param unumber
     * @param upass
     * @return
     */
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "unumber", value = "手机账号", required = true, dataType = "String"),
                    @ApiImplicitParam(name = "upass",value = "密码",required = true,dataType = "String")
             })
    @ApiOperation(value = "获得姓名和密码", notes = "根据url的name和url的password获得请求参数的字符串相加，RestFul风格的请求")
    @RequestMapping("/login")
    public String login(String unumber, String upass){
        User user=userService.login(unumber,upass);
        if (user!=null){
            return JSON.toJSONString(userService.updateState((int) user.getUid()));
        }
        return JSON.toJSONString(user);
    }


    /**
     * 注册
     * @param unumber
     * @param upass
     * @param code
     * @return
     */
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "unumber", value = "手机账号", required = true, dataType = "String"),
                    @ApiImplicitParam(name = "upass",value = "密码",required = true,dataType = "String"),
                    @ApiImplicitParam(name = "code", value = "手机验证码", required = true, dataType = "String")
            })
    @ApiOperation(value = "注册姓名和密码,获取手机验证码", notes = "根据url的name和url的password获得请求参数的字符串相加，RestFul风格的请求")
    @RequestMapping("/regin")
    public String regin(String unumber, String upass,String code){
            return JSON.toJSONString(userService.regin(unumber,upass,code));
    }


    /**
     * 退出登录
     * @param uid
     * @return
     */
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "uid", value = "用户id", required = true, dataType = "String"),
            })
    @ApiOperation(value = "修改用户登录状态", notes = "根据url的name和url的password获得请求参数的字符串相加，RestFul风格的请求")
    @RequestMapping("/outLogin")
    public String outLogin(Integer uid){
        return JSON.toJSONString(userService.outLogin(uid));
    }

    /**
     * 个人信息展示
     * @param uid
     * @return
     */
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "uid", value = "用户id", required = true,paramType = "path",dataType = "int"),
            })
    @ApiOperation(value = "个人信息展示", notes = "根据url的name和url的password获得请求参数的字符串相加，RestFul风格的请求")
    @RequestMapping(value = "/getuserInfo/{uid}",method = RequestMethod.GET)
    public String getuserInfo(@PathVariable String uid){
        User user=userService.getuserInfo(Integer.parseInt(uid));
        return JSON.toJSONString(user);

    }


    /**
     *账户充值
     * @param uid
     * @return
     */
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "uid", value = "用户id", required = true, dataType = "String"),
                    @ApiImplicitParam(name = "ubalance", value = "用户余额", required = true, dataType = "String"),
            })
    @ApiOperation(value = "账户余额充值", notes = "根据url的name和url的password获得请求参数的字符串相加，RestFul风格的请求")
    @RequestMapping("/recharge")
    public String recharge(Integer uid,Double ubalance){
        return JSON.toJSONString(userService.recharge(uid,ubalance));
    }

}
