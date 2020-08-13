package com.lr.concurrent.cv;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author mac
 * @date 2020/7/1
 */
@Data
public class FormGroupVO implements Serializable {

    /**
     * 模块主键
     */
    private Integer groupId;
    /**
     * 模块标题: 如个人信息,教育经历,工作经历
     */
    @ApiModelProperty("模块英文名,如basic,educations,workExperiences")
    private String groupTitleEn;

    @ApiModelProperty("模块中文名,如个人信息,教育经历,工作经历")
    private String groupTitleZh;

    @ApiModelProperty("映射关系")
    private String cvMapping;

    @ApiModelProperty("排序")
    Integer order;

    /**
     * 字段数组,兼容repeatable结构
     */
    private List<List<FormFieldVO>> fieldArrays;
}
