package com.lr.entity.dto;

import com.lr.entity.bo.HeadLine;
import com.lr.entity.bo.ShopCategory;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author liurui
 * @date 2020/8/30 9:00
 */
@Data
public class MainPageInfoDTO implements Serializable {
    private List<HeadLine> headLineList;
    private List<ShopCategory> shopCategoryList;

}
