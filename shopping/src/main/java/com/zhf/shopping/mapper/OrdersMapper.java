package com.zhf.shopping.mapper;

import com.zhf.shopping.entity.Orders;

import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    Orders findUserByOrderId(Integer orderId);

    List<Orders> findOrderDetailsByOrderId(Integer orderId);
}