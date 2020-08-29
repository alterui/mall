package com.lr.service.solo;

import com.lr.entity.bo.HeadLine;
import com.lr.entity.bo.ShopCategory;
import com.lr.entity.dto.Result;

import java.util.List;

/**
 * @author liurui
 * @date 2020/8/29 23:45
 */
public interface ShopCategoryService {
    Result<Boolean> addShopCategory(ShopCategory shopCategory);

    Result<Boolean> removeShopCategory(Integer shopCategoryId);

    Result<Boolean> modifyShopCategory(ShopCategory shopCategory);

    Result<ShopCategory> queryShopCategoryById(Integer shopCategoryId);

    Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategoryCondition, Integer pageIndex, Integer pageSize);
}
