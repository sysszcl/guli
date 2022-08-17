package com.atguigu.statistics.schedule;

import com.atguigu.statistics.service.DailystatisticsService;
import com.atguigu.statistics.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author yuanquan
 * @create 2022-08-13 22:21
 */
@Component
public class ScheduledTask {
    @Autowired
    private DailystatisticsService dailyService;
/**
 * 测试
 *
 *
 * 每天七点到二十三点每五秒执行一次
 */
//@Scheduled(cron = "0/5 * * * * ?")
//public void task1() {
//    System.out.println("*********++++++++++++*****执行了");
//}
    /**
     * 每天凌晨1点执行定时
     */
    @Scheduled(cron = "0 0 1 * * ?")
    public void task2() {
//获取上一天的日期
        String day = DateUtil.formatDate(DateUtil.addDays(new Date(), -1));
        dailyService.createStatisticsByDay(day);
    }
}