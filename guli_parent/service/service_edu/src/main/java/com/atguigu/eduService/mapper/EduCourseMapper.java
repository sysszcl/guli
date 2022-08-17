package com.atguigu.eduService.mapper;

import com.atguigu.eduService.entity.EduCourse;
import com.atguigu.eduService.entity.vo.CoursePublishVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 课程 Mapper 接口
 * </p>
 *
 * @author atguigu
 * @since 2022-08-03
 */
public interface EduCourseMapper extends BaseMapper<EduCourse> {
    CoursePublishVo selectCoursePublishVoById(String id);
}
