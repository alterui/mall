package com.lr.concurrent.cv;

import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author yehu
 * date 2020-02-28 19:17
 */
@Data
@ApiModel("候选人简历-获得奖项")
public class AwardVO {

    @ApiModelProperty("奖项名称")
    private String name;

    @ApiModelProperty("获奖时间")
    private String time;

    @ApiModelProperty("获得奖项自定义字段")
    private List<FormFieldVO> customFormFields;
}
