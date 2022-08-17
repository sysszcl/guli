package com.atguigu.eduservice.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author yuanquan
 * @create 2022-08-01 22:51
 */
@Data
public class DemoData {
    //设置表头名称
    @ExcelProperty("学生编号")
    private int sno;
    //设置表头名称
    @ExcelProperty("学生姓名")
    private String sname;
}
