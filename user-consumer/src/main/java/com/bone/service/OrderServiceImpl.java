package com.bone.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bone.entity.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhuyuanyuan
 * @description OrderServiceImpl
 * @date 2021/7/12 11:23 上午
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Reference
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        userAddressList.forEach(userAddress -> System.out.println(userAddress));
        return userAddressList;
    }

}
