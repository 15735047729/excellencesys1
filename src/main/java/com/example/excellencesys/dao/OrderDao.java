package com.example.excellencesys.dao;

import com.example.excellencesys.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {

    List<Order>  getAllOrder(@Param("uid") Integer uid);

}
