package com.atguigu.eduService.entity.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author yuanquan
 * @create 2022-08-04 20:24
 */
@ApiModel(value = "课时信息")
@Data
public class VideoVo {
    private static final long serialVersionUID = 1L;
    private String id;
    private String title;
    private Boolean free;
}
