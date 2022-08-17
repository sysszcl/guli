package com.atguigu.eduService.controller;


import com.atguigu.commonutils.R;
import com.atguigu.eduService.entity.vo.SubjectNestedVo;
import com.atguigu.eduService.service.EduSubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * 课程科目 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2022-08-02
 */
@Api(description="课程分类管理")
@CrossOrigin //跨域
@RestController
@RequestMapping("/eduService/subject")
public class EduSubjectController {
    @Autowired
    private EduSubjectService subjectService;
    //添加课程分类
    @ApiOperation(value = "Excel批量导入")
    @PostMapping("addSubject")
    public R addSubject(MultipartFile file) {
//1 获取上传的excel文件 MultipartFile
//返回错误提示信息
        subjectService.importSubjectData(file,subjectService);
//判断返回集合是否为空
        return R.ok();
    }

    @ApiOperation(value = "嵌套数据列表")
    @GetMapping("getAllSubject")
    public R nestedList(){
        List<SubjectNestedVo> subjectNestedVoList = subjectService.nestedList();
        return R.ok().data("items", subjectNestedVoList);
    }

}

