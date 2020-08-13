package com.lr.concurrent.cv;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by qiancheng on 2019/11/29.
 */
@Data
@ToString
@Slf4j
@JsonFilter("emptyfilter")
@NoArgsConstructor
public class FormElementDataVO implements Serializable {

    @ApiModelProperty("关联字段库中的字段ID或字段组ID,字段元素关联form_field.id,block元素关联form_field_group.id")
    private Integer fieldId;
    private Integer fieldGroupId;

    @ApiModelProperty("子元素或块")
    private List<FormElementDataVO> children;

    private List<List<FormFieldVO>> dataList = Lists.newArrayList();

    private String cvMapping;

    private String type;

    private String style;

    private String title;

    private String titleEn;

    private Integer order;

    private Map<String, String> ext;
}