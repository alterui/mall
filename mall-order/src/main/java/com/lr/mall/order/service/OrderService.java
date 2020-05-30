package com.lr.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lr.common.utils.PageUtils;
import com.lr.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author liurui
 * @email liurui@gmail.com
 * @date 2020-05-30 11:33:32
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

