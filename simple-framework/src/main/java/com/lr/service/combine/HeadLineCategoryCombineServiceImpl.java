package com.lr.service.combine;

import com.lr.entity.bo.HeadLine;
import com.lr.entity.bo.ShopCategory;
import com.lr.entity.dto.MainPageInfoDTO;
import com.lr.entity.dto.Result;
import com.lr.service.solo.HeadLineService;
import com.lr.service.solo.ShopCategoryService;

import java.util.List;

/**
 * @author liurui
 * @date 2020/8/30 9:02
 */
public class HeadLineCategoryCombineServiceImpl implements HeadLineCategoryCombineService {

    private HeadLineService headLineService;
    private ShopCategoryService shopCategoryService;

    @Override
    public Result<MainPageInfoDTO> getMainPageInfoDTO() {
        HeadLine headLine = new HeadLine();
        headLine.setEnableStatus(1);
        Result<List<HeadLine>> headLineResult  = headLineService.queryHeadLine(headLine, 0, 5);

        ShopCategory shopCategory = new ShopCategory();
        Result<List<ShopCategory>> shopCategoryResult = shopCategoryService.queryShopCategory(shopCategory, 0, 10);

        Result<MainPageInfoDTO> result = mergeMainPageInfoResult(headLineResult, shopCategoryResult);
        return result;

    }

    private Result<MainPageInfoDTO> mergeMainPageInfoResult(Result<List<HeadLine>> headLineResult, Result<List<ShopCategory>> shopCategoryResult) {
        return null;
    }
}
