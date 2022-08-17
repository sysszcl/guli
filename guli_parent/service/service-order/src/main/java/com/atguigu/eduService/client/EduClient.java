package com.atguigu.eduService.client;

import com.atguigu.commonutils.ordervo.CourseWebVoOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yuanquan
 * @create 2022-08-13 16:14
 */
@Component
@FeignClient("service-edu")
public interface EduClient {
    //根据课程id查询课程信息
    @GetMapping("/eduservice/course/getDto/{courseId}")
    public CourseWebVoOrder getCourseInfoDto(@PathVariable String courseId);
}
