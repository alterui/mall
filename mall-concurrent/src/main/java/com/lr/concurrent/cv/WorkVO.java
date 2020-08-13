package com.lr.concurrent.cv;

import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author yehu
 * date 2020-02-28 19:18
 */
@Data

public class WorkVO {

    @ApiModelProperty("链接地址")
    private String url;

    @ApiModelProperty("作品描述")
    private String description;

    @ApiModelProperty("作品封面")
    private String cover;

    @ApiModelProperty("个人作品申请表字段")
    private List<FormFieldVO> customFormFields;
}
