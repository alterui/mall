package com.lr.concurrent.cv;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class FormFieldVO {

    private Integer fieldId;
    @ApiModelProperty("控件英文名")
    private String fieldTitleEn;
    @ApiModelProperty("控件中文名")
    private String fieldTitleZh;
    @ApiModelProperty("cv映射关系")
    private String cvMapping;
    @ApiModelProperty("排序")
    private Integer order;
    private String stringValue;
    /**
     * 存code和name
     */
    private EnumEntityVO stringValueEnum;
    private List<String> multiValue;
    /**
     * 存code和name
     */
    private List<EnumEntityVO> multiValueEnum;
    private TimeValueVO timeValue;
    private String type;
    private String style;

    @Data
    public static class TimeValueVO {
        private String startTime;
        private String endTime;
        private Integer endUntilNow;
    }
}