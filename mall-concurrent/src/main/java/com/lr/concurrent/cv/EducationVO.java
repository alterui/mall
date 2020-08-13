package com.lr.concurrent.cv;

import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author yehu
 * date 2020-02-28 19:15
 */
@Data
@ApiModel("候选人简历-教育经历")
public class EducationVO {

    @ApiModelProperty("学校名称")
    private EnumEntityVO college;

    @ApiModelProperty("起止时间：开始时间")
    private String startTime;

    @ApiModelProperty("起止时间：结束时间")
    private String endTime;

    @ApiModelProperty("1至今0或Null表示非至今")
    private Integer endUntilNow;

    @ApiModelProperty("专业")
    private EnumEntityVO major;

    @ApiModelProperty("学历")
    private EnumEntityVO degree;

    @ApiModelProperty("在校经历描述")
    private String description;

    @ApiModelProperty("gpa")
    private Double gpa;

    @ApiModelProperty("教育经历申请表字段")
    private List<FormFieldVO> customFormFields;
}
