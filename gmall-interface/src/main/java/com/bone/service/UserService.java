package com.bone.service;

import com.bone.entity.UserAddress;

import java.util.List;

/**
 * @author zhuyuanyuan
 * @description UserService
 * @date 2021/7/12 9:40 上午
 */
public interface UserService {

    /**
     * 获取用户地址列表
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);

}
