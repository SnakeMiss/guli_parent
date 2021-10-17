package com.atguigu.eduservice.entity.vo.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class NewCourseReq {
    @ApiModelProperty(value = "课程标题")
    private String title;

    @ApiModelProperty(value = "一级分类")
    private String oneCategory;

    @ApiModelProperty(value = "二级分类")
    private String twoCategory;

    @ApiModelProperty(value = "总时长")
    private String lessonNum;

    @ApiModelProperty(value = "简介")
    private String description;

    @ApiModelProperty(value = "总时长")
    private String cover;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

}
