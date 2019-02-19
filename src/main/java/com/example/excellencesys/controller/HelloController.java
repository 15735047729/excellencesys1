package com.example.excellencesys.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(tags = "swagger初学Demo")
public class HelloController {

    /*@ApiOperation：用在请求的方法上，说明方法的用途、作用
	value="说明方法的用途、作用"
	notes="方法的备注说明"
* */
     @ApiImplicitParams({@ApiImplicitParam(name = "name", value = "姓名", required = true, dataType = "String"),@ApiImplicitParam(name = "password",value = "密码",dataType = "String")
    })
    @ApiOperation(value = "获得姓名和密码", notes = "根据url的name和url的password获得请求参数的字符串相加，RestFul风格的请求")
    @RequestMapping(value = "/class/{name}/to/{password}", method = RequestMethod.GET)
    public String world(@PathVariable("name") String name, @PathVariable("password") String password) {
        System.out.println(name);
        System.out.println(password);
        return name + "=====" + password;
    }
}
