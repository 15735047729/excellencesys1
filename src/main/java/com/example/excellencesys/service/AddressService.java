package com.example.excellencesys.service;

import com.example.excellencesys.pojo.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAddressList(Integer uid);//显示收货地址列表
    Integer updateAddress(String address,Integer addid);//修改收货地址
    Integer addAddress(String address,Integer uid);//添加收货地址
    Integer delAddress(Integer addid);//删除收货地址
}
