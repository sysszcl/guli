package com.atguigu.eduService.controller;


import com.atguigu.commonutils.R;
import com.atguigu.eduService.entity.EduChapter;
import com.atguigu.eduService.entity.vo.ChapterVo;
import com.atguigu.eduService.service.EduChapterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 课程 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2022-08-03
 */
@Api(description="课程章节管理")
@CrossOrigin //跨域
@RestController
@RequestMapping("/eduservice/chapter")
public class EduChapterController {

    @Autowired
    private EduChapterService chapterService;

    @ApiOperation(value = "嵌套章节数据列表")
    @GetMapping("getChapterVideo/{courseId}")
    public R nestedListByCourseId(@ApiParam(name = "courseId", value = "课程ID", required = true)
                                      @PathVariable String courseId){
        List<ChapterVo> chapterVoList = chapterService.nestedList(courseId);
        return R.ok().data("items", chapterVoList);
    }

    @ApiOperation(value = "新增章节")
    @PostMapping("addChapter")
    public R save(
            @ApiParam(name = "chapterVo", value = "章节对象", required = true)
            @RequestBody EduChapter chapter){
        chapterService.save(chapter);
        return R.ok();
    }

    @ApiOperation(value = "根据ID查询章节")
    @GetMapping("getChapterInfo/{id}")
    public R getById(
            @ApiParam(name = "id", value = "章节ID", required = true)
            @PathVariable String id){
        EduChapter chapter = chapterService.getById(id);
        return R.ok().data("item", chapter);
    }

    @ApiOperation(value = "根据ID修改章节")
    @PostMapping("updateChapter")
    public R updateById(
            @RequestBody EduChapter chapter){
        chapterService.updateById(chapter);
        return R.ok();
    }

    @ApiOperation(value = "根据ID删除章节")
    @DeleteMapping("{id}")
    public R removeById(
            @ApiParam(name = "id", value = "章节ID", required = true)
            @PathVariable String id){
        boolean result = chapterService.removeChapterById(id);
        if(result){
            return R.ok();
        }else{
            return R.error().message("删除失败");
        }
    }
}

