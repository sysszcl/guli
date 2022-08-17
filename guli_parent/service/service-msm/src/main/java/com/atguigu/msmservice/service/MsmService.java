package com.atguigu.msmservice.service;

import java.util.Map;

/**
 * @author yuanquan
 * @create 2022-08-08 22:15
 */
public interface MsmService {
    boolean send(String phone, String sms_180051135, Map<String, Object> param);
}
