package com.atguigu.eduService.entity.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuanquan
 * @create 2022-08-03 20:54
 */
@Data
public class SubjectNestedVo {
    private String id;
    private String title;
    private List<SubjectVo> children = new ArrayList<>();
}
