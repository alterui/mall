package com.lr.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lr.common.utils.PageUtils;
import com.lr.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author liurui
 * @email liurui@gmail.com
 * @date 2020-05-29 22:35:31
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

