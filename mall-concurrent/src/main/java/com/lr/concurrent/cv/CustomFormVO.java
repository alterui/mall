package com.lr.concurrent.cv;

import lombok.Data;

import java.util.List;

/**
 * @author mac
 * @date 2020/7/2
 */
@Data
public class CustomFormVO {

    private String relatedTo;

    /**
     * title: 学校名称 stringValue: 清华大学
     */
    private String title;

    private String stringValue;

    private List<String> multiValue;

    private FormFieldVO.TimeValueVO timeValue;
}
