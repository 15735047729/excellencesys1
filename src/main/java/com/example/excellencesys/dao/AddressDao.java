package com.example.excellencesys.dao;

import com.example.excellencesys.pojo.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressDao {
    List<Address> getAddressList(@Param("uid") Integer uid);//显示收货地址列表
    Integer updateAddress(@Param("address") String address,@Param("addid") Integer addid);//修改收货地址
    Integer addAddress(@Param("address") String address,@Param("uid") Integer uid);//添加收货地址
    Integer delAddress(@Param("addid") Integer addid);//删除收货地址
}
