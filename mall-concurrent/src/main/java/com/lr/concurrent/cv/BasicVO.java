package com.lr.concurrent.cv;

import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author yehu
 * date 2020-02-28 19:12
 */
@Data
@ApiModel("候选人简历-个人信息")
public class BasicVO {

    @ApiModelProperty("最近公司")
    private String recentCompany;

    @ApiModelProperty("最近担任职位")
    private String recentWork;

    @ApiModelProperty("国籍")
    private EnumEntityVO nationality;

    @ApiModelProperty("身份证/护照/军官证/香港身份证/台湾身份证/澳门身份证/其他证件")
    private EnumEntityVO credentialsType;

    @ApiModelProperty("证件号码")
    private String credentialsNumber;

    @ApiModelProperty("当前薪资")
    private String salary;

    @ApiModelProperty("自我描述")
    private String selfDescription;

    @ApiModelProperty("个人信息申请表字段")
    private List<FormFieldVO> customFormFields;
}
