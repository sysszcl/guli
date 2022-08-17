package com.atguigu.eduService.client;

import com.atguigu.commonutils.ordervo.UcenterMemberOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author yuanquan
 * @create 2022-08-13 16:16
 */
@Component
@FeignClient("service-ucenter")
public interface UcenterClient {

    //根据token字符串获取用户信息
    @PostMapping("/educenter/apimember/getInfoUc/{id}")
    public UcenterMemberOrder getInfo(@PathVariable String id);
}
