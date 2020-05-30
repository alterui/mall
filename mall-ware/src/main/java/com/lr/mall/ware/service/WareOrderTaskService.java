package com.lr.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lr.common.utils.PageUtils;
import com.lr.mall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author liurui
 * @email liurui@gmail.com
 * @date 2020-05-30 11:41:52
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

