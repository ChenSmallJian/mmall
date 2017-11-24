package com.mmall.service;

import com.mmall.common.ServerResponse;

import java.util.Map;

/**
 * created by chenjian
 */
public interface IOrderService {

    ServerResponse pay(Long orderNO, Integer userId, String path);

    ServerResponse aliCallBack(Map<String,String> params);

    ServerResponse<Boolean> queryOrderPayStatus(Integer userId, Long orderNo);
}