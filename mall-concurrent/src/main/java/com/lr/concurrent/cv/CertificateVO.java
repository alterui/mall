package com.lr.concurrent.cv;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author mac
 * @date 2020/5/14
 */
@Data
public class CertificateVO {

    /**
     * 证书名称
     */
    private String name;
    /**
     * 证书机构
     */
    private String organization;
    /**
     * 证书编码
     */
    private String code;
    /**
     * 证书链接
     */
    private String url;
    /**
     * 成绩
     */
    private String score;
    /**
     * 获取时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date getDate;

    @ApiModelProperty("证书申请表字段")
    private List<FormFieldVO> customFormFields;
}
