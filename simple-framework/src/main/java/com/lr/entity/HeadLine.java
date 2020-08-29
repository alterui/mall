package com.lr.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liurui
 * @date 2020/8/29 19:10
 */

@Data
public class HeadLine implements Serializable {
    private Long lineId;
    private String lineName;
    private String lineLink;
    private String lineImg;
    private Integer priority;
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;

}
