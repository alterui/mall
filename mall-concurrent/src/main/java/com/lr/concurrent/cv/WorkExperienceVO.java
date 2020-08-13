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
@ApiModel("候选人简历-工作经历")
public class WorkExperienceVO {

    @ApiModelProperty("公司名称")
    private String company;

    @ApiModelProperty("职位名称")
    private String job;

    @ApiModelProperty("所在部门")
    private String department;

    @ApiModelProperty("起止时间：开始工作时间")
    private String startTime;

    @ApiModelProperty("起止时间：结束工作时间")
    private String endTime;

    @ApiModelProperty("1至今0或Null表示非至今")
    private Integer endUntilNow;

    @ApiModelProperty("工作内容描述")
    private String description;

    @ApiModelProperty("工作经历申请表字段")
    private List<FormFieldVO> customFormFields;
}
