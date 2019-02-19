package com.example.excellencesys.service;

import com.example.excellencesys.pojo.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAddressList(Integer uid);//显示收货地址列表
    Integer updateAddress(Address address);//修改收货地址
    Integer addAddress(Address address);//添加收货地址
}
