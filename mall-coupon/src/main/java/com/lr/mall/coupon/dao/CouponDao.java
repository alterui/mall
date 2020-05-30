package com.lr.mall.coupon.dao;

import com.lr.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author liurui
 * @email liurui@gmail.com
 * @date 2020-05-30 10:07:55
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
