package com.lr.entity.bo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liurui
 * @date 2020/8/29 19:10
 */

@Data
@Slf4j
public class HeadLine implements Serializable {
    private Long lineId;
    private String lineName;
    private String lineLink;
    private String lineImg;
    private Integer priority;
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;

    public static void main(String[] args) {
        HeadLine headLine = new HeadLine();

        System.out.println(headLine.getCreateTime());
    }

}
