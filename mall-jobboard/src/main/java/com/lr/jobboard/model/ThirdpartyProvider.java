package com.lr.jobboard.model;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author liurui
 * @date 2020/8/28 10:44 上午
 */
@Data
public class ThirdpartyProvider implements Serializable {

    private Integer id;
    private String name;
    private String key;
    private String type;
    private String desc;
    private String logo;
    private Byte status;
    private Timestamp createTime;
    private Timestamp updateTime;
}
