package com.atguigu.eduService.controller.front;

import com.atguigu.commonutils.R;
import com.atguigu.eduService.entity.EduTeacher;
import com.atguigu.eduService.service.EduChapterService;
import com.atguigu.eduService.service.EduTeacherService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author yuanquan
 * @create 2022-08-13 12:41
 */
@RestController
@CrossOrigin
@RequestMapping("/eduservice/teacherfront")
public class TeacherController {

    @Autowired
    private EduTeacherService eduTeacherService;

    @ApiOperation(value = "分页讲师列表")
    @GetMapping(value = "getTeacherFrontList/{page}/{limit}")
    public R pageList(
            @ApiParam(name = "page", value = "当前页码", required = true)
            @PathVariable Long page,
            @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit){
        Page<EduTeacher> pageParam = new Page<EduTeacher>(page, limit);
        Map<String, Object> map = eduTeacherService.pageListWeb(pageParam);
        return R.ok().data(map);
    }

}
