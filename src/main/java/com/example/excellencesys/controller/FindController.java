package com.example.excellencesys.controller;


import com.example.excellencesys.service.FindService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "发现")
public class FindController {
    @Autowired
    FindService findService;

    @ApiOperation(value = "详细信息")
    @ApiResponses({@ApiResponse(code = 1,message="操作成功"),
            @ApiResponse(code = 0,message = "操作失败，服务器内部异常"),
            @ApiResponse(code = 303,message = "权限不足")})
    @RequestMapping(value = "/allmessage}", method = RequestMethod.GET)
    public List message(int oid){
        return findService.allmessage(oid);
    }

    @ApiOperation(value = "发现模块")
    @ApiResponses({@ApiResponse(code = 1,message="操作成功"),
            @ApiResponse(code = 0,message = "操作失败，服务器内部异常"),
            @ApiResponse(code = 303,message = "权限不足")})
    @RequestMapping(value = "/findtype", method = RequestMethod.GET)
    public List type(){
        return findService.findtype();
    }

}
