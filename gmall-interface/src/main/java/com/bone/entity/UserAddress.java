package com.bone.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhuyuanyuan
 * @description UserAddress
 * @date 2021/7/12 9:31 上午
 */
@Data
public class UserAddress implements Serializable {

    private Integer id;

    private String userAddress;

    private String userId;

    private String consignee;

    private String phoneNum;

    private String isDefault;

    public UserAddress() {
    }

    public UserAddress(Integer id, String userAddress, String userId, String consignee, String phoneNum, String isDefault) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }

}
