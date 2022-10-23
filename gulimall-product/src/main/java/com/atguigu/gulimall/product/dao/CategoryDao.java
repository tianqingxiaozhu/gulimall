package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tianqingxiaozhu
 * @email zeanzai.me@gmail.com
 * @date 2022-10-24 00:02:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
