package com.example.excellencesys.service.impl;

import com.example.excellencesys.dao.AddressDao;
import com.example.excellencesys.pojo.Address;
import com.example.excellencesys.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("AdderssService")
public class AddressServiceImpl implements AddressService{
    @Resource
    private AddressDao addressDao;

    @Override
    public List<Address> getAddressList(Integer uid) {
        return addressDao.getAddressList(uid);
    }

    @Override
    public Integer updateAddress(Address address) {
        return addressDao.updateAddress(address);
    }

    @Override
    public Integer addAddress(Address address) {
        return addressDao.addAddress(address);
    }
}
