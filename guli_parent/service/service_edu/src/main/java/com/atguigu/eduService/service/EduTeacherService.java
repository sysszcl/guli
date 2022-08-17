package com.atguigu.eduService.service;

import com.atguigu.eduService.entity.EduTeacher;
import com.atguigu.eduService.entity.vo.TeacherQuery;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author atguigu
 * @since 2022-07-28
 */
public interface EduTeacherService extends IService<EduTeacher> {

    void pageQuery(Page<EduTeacher> pageParam, TeacherQuery teacherQuery);

    Map<String, Object> pageListWeb(Page<EduTeacher> pageParam);
}
