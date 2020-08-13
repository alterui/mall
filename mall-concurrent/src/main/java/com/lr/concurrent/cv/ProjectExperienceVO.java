package com.lr.concurrent.cv;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author yehu
 * date 2020-02-28 19:16
 */
@Data
@ApiModel("候选人简历-项目经验")
public class ProjectExperienceVO {

    @ApiModelProperty("项目名称")
    private String name;

    @ApiModelProperty("所在公司名称")
    private String company;

    @ApiModelProperty("担任职务")
    private String role;

    @ApiModelProperty("起止时间：开始工作时间")
    private String startTime;

    @ApiModelProperty("起止时间：结束工作时间")
    private String endTime;

    @ApiModelProperty("1至今0或Null表示非至今")
    private Integer endUntilNow;

    @ApiModelProperty("项目描述")
    private String description;

    @ApiModelProperty("项目职责")
    private String responsability;

    @ApiModelProperty("项目经历申请表字段")
    private List<FormFieldVO> customFormFields;
}
