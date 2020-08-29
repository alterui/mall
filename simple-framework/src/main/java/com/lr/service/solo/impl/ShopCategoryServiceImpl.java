package com.lr.service.solo.impl;

import com.lr.entity.bo.ShopCategory;
import com.lr.entity.dto.Result;
import com.lr.service.solo.ShopCategoryService;

import java.util.List;

/**
 * @author liurui
 * @date 2020/8/29 23:49
 */
public class ShopCategoryServiceImpl implements ShopCategoryService {


    @Override
    public Result<Boolean> addShopCategory(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<Boolean> removeShopCategory(Integer shopCategoryId) {
        return null;
    }

    @Override
    public Result<Boolean> modifyShopCategory(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<ShopCategory> queryShopCategoryById(Integer shopCategoryId) {
        return null;
    }

    @Override
    public Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategoryCondition, Integer pageIndex, Integer pageSize) {
        return null;
    }
}
