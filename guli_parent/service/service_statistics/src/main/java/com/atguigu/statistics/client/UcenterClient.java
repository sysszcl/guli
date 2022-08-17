package com.atguigu.statistics.client;

import com.atguigu.commonutils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yuanquan
 * @create 2022-08-13 20:34
 */

@Component
@FeignClient("service-ucenter")
public interface UcenterClient {

        @GetMapping(value = "/educenter/apimember/countregister/{day}")
        public R registerCount(@PathVariable("day") String day);

}
