package com.lr.concurrent.cv;

import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author yehu
 * date 2020-02-28 19:11
 */
@Data
@ApiModel("候选人简历-摘要信息")
public class OverviewVO {

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("性别(1男2女3保密)")
    private EnumEntityVO gender;

    @ApiModelProperty("生日")
    private String birth;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("国家代码")
    private String countryCode;

    @ApiModelProperty("电话")
    private String mobile;

    @ApiModelProperty("工作年限")
    private Integer workYears;

    @ApiModelProperty("最高学历")
    private Integer degree;

    @ApiModelProperty("当前所在地")
    private EnumEntityVO city;

    @ApiModelProperty("微信")
    private String wechat;

    @ApiModelProperty("微信头像")
    private String wechatAvatar;

    @ApiModelProperty("区号")
    private String areaCode;

    @ApiModelProperty("QQ")
    private String qq;

    @ApiModelProperty("摘要信息申请表字段")
    private List<FormFieldVO> customFormFields;
}
