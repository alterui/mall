package com.lr.mall.member.dao;

import com.lr.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author liurui
 * @email liurui@gmail.com
 * @date 2020-05-30 11:02:43
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
