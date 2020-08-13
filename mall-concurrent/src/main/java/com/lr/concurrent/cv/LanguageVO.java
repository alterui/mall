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
@ApiModel("候选人简历-语言能力")
public class LanguageVO {

    @ApiModelProperty("语言类型")
    private String name;

    @ApiModelProperty("熟练程度")
    private Integer level;

    @ApiModelProperty("语言能力申请表字段")
    private List<FormFieldVO> customFormFields;
}
