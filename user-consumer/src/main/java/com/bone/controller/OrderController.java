package com.bone.controller;

import com.bone.entity.UserAddress;
import com.bone.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhuyuanyuan
 * @description OrderController
 * @date 2021/7/12 2:46 下午
 */
@RestController
@RequestMapping("/test")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping
    public List<UserAddress> getUserAddress(@RequestParam(value = "userId") String userId) {
        return orderService.initOrder(userId);
    }
}
