package com.bone.service;

import com.bone.entity.UserAddress;

import java.util.List;

/**
 * @author zhuyuanyuan
 * @description OrderService
 * @date 2021/7/12 10:04 上午
 */
public interface OrderService {

    /**
     * 服务消费者
     * @param userId
     */
    List<UserAddress> initOrder(String userId);

}
