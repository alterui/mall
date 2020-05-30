package com.lr.mall.ware.dao;

import com.lr.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author liurui
 * @email liurui@gmail.com
 * @date 2020-05-30 11:41:52
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
