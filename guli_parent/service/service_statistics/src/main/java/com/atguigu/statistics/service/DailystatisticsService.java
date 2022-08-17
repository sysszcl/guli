package com.atguigu.statistics.service;

import com.atguigu.statistics.entity.Daily;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 网站统计日数据 服务类
 * </p>
 *
 * @author atguigu
 * @since 2022-08-13
 */
public interface DailystatisticsService extends IService<Daily> {

    void createStatisticsByDay(String day);

    Map<String, Object> getChartData(String begin, String end, String type);
}
