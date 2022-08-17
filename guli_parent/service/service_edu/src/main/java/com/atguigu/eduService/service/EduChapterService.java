package com.atguigu.eduService.service;

import com.atguigu.eduService.entity.EduChapter;
import com.atguigu.eduService.entity.vo.ChapterVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author atguigu
 * @since 2022-08-03
 */
public interface EduChapterService extends IService<EduChapter> {

    List<ChapterVo> nestedList(String courseId);

    boolean removeChapterById(String id);
}
