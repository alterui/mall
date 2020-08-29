package com.lr.entity.bo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liurui
 * @date 2020/8/29 19:33
 */

@Data
public class ShopCategory implements Serializable {
    private Long shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;

}
