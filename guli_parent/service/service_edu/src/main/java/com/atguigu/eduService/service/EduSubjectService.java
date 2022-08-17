package com.atguigu.eduService.service;

import com.atguigu.eduService.entity.EduSubject;
import com.atguigu.eduService.entity.vo.SubjectNestedVo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * 课程科目 服务类
 * </p>
 *
 * @author atguigu
 * @since 2022-08-02
 */
public interface EduSubjectService extends IService<EduSubject> {

    void importSubjectData(MultipartFile file, EduSubjectService subjectService);

    List<SubjectNestedVo> nestedList();
}
