package com.lr.concurrent.cv;

import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author yehu
 * date 2020-02-28 19:13
 */
@Data
@ApiModel("候选人简历-求职意向")
public class IntentionVO {

    @ApiModelProperty("当前是否在职状态, 0:未填写 1: 在职，看看新机会, 2: 在职，急寻新工作, 3:在职，暂无跳槽打算, 4:离职，正在找工作, 5:应届毕业生")
    private EnumEntityVO workState;

    @ApiModelProperty("工作类型, {\"0\":\"没选择\", \"1\":\"全职\", \"2\":\"兼职\", \"3\":\"实习\"}")
    private EnumEntityVO workType;

    @ApiModelProperty("期望月薪")
    private String expectedSalary;

    @ApiModelProperty("期望工作城市")
    private List<EnumEntityVO> cities;

    @ApiModelProperty("期望行业")
    private List<EnumEntityVO> industries;

    @ApiModelProperty("期望职能")
    private List<EnumEntityVO> positions;

    @ApiModelProperty("求职意向申请表字段")
    private List<FormFieldVO> customFormFields;
}
