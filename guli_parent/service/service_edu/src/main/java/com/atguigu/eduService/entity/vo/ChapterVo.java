package com.atguigu.eduService.entity.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuanquan
 * @create 2022-08-04 20:23
 */
@ApiModel(value = "章节信息")
@Data
public class ChapterVo {
    private static final long serialVersionUID = 1L;
    private String id;
    private String title;
    private List<VideoVo> children = new ArrayList<>();
}
