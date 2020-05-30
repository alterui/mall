package com.lr.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lr.common.utils.PageUtils;
import com.lr.mall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author liurui
 * @email liurui@gmail.com
 * @date 2020-05-30 11:41:52
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

