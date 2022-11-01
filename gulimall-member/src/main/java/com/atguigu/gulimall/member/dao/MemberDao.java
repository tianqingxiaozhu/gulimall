package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tianqingxiaozhu
 * @email zeanzai.me@gmail.com
 * @date 2022-10-27 11:14:37
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
