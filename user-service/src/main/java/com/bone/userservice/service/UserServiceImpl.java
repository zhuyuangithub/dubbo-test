package com.bone.userservice.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.bone.entity.UserAddress;
import com.bone.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuyuanyuan
 * @description UserServiceImpl
 * @date 2021/7/12 9:41 上午
 */
@Component
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        List<UserAddress> userAddresses = new ArrayList<>();
        userAddresses.add(new UserAddress(1, "北京市龙腾苑", "7000001", "竹元元", "13121935494", "true"));
        userAddresses.add(new UserAddress(2, "渭南市临渭区", "7000002", "竹建喜", "19991366641", "false"));
        return userAddresses;
    }
}
