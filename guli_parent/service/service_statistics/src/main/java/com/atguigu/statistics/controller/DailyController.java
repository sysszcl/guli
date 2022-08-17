package com.atguigu.statistics.controller;


import com.atguigu.commonutils.R;
import com.atguigu.statistics.service.DailystatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 * 网站统计日数据 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2022-08-13
 */
@CrossOrigin
@RestController
@RequestMapping("/statistics/daily")
public class DailyController {

    @Autowired
    private DailystatisticsService dailystatisticsService;

    @PostMapping("{day}")
    public R createStatisticsByDate(@PathVariable String day) {
        dailystatisticsService.createStatisticsByDay(day);
        return R.ok();
    }


    @GetMapping("show-chart/{type}/{begin}/{end}")
    public R showChart(@PathVariable String begin,@PathVariable String
            end,@PathVariable String type){
        Map<String, Object> map = dailystatisticsService.getChartData(begin, end, type);
        return R.ok().data(map);
    }

}

