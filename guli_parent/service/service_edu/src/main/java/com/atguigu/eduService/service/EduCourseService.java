package com.atguigu.eduService.service;

import com.atguigu.eduService.entity.EduCourse;
import com.atguigu.eduService.entity.form.CourseInfoForm;
import com.atguigu.eduService.entity.vo.CoursePublishVo;
import com.atguigu.eduService.entity.vo.CourseQuery;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author atguigu
 * @since 2022-08-03
 */
public interface EduCourseService extends IService<EduCourse> {

    String saveCourseInfo(CourseInfoForm courseInfoForm);

    CourseInfoForm getCourseInfoFormById(String id);

    void updateCourseInfoById(CourseInfoForm courseInfoForm);

    CoursePublishVo getCoursePublishVoById(String id);

    boolean publishCourseById(String id);

    void pageQuery(Page<EduCourse> pageParam, CourseQuery courseQuery);
}
