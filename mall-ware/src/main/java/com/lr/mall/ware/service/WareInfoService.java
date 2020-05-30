package com.lr.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lr.common.utils.PageUtils;
import com.lr.mall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author liurui
 * @email liurui@gmail.com
 * @date 2020-05-30 11:41:52
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

