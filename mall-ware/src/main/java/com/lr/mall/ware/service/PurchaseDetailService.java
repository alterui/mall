package com.lr.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lr.common.utils.PageUtils;
import com.lr.mall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author liurui
 * @email liurui@gmail.com
 * @date 2020-05-30 11:41:52
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

