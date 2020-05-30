package com.lr.mall.order.dao;

import com.lr.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liurui
 * @email liurui@gmail.com
 * @date 2020-05-30 11:33:32
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
