package com.lr.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lr.common.utils.PageUtils;
import com.lr.common.utils.Query;

import com.lr.mall.product.dao.CategoryDao;
import com.lr.mall.product.entity.CategoryEntity;
import com.lr.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {

        //1.查出所有分类
        List<CategoryEntity> categoryEntityList = baseMapper.selectList(null);

        //2.查出所有的一级菜单
        return categoryEntityList.stream()
                .filter(e -> Objects.equals(e.getParentCid(), 0L))
                .peek(e -> e.setChild(getCategoryAndChild(e, categoryEntityList)))
                .sorted(Comparator.comparingInt(k -> (k.getSort() == null ? 0 : k.getSort())))
                .collect(Collectors.toList());
    }

    private List<CategoryEntity> getCategoryAndChild(CategoryEntity root, List<CategoryEntity> all) {
        return all.stream()
                .filter(e -> Objects.equals(root.getCatId(), e.getParentCid()))
                .peek(e -> e.setChild(getCategoryAndChild(e, all)))
                .sorted(Comparator.comparingInt((e -> e.getSort() == null ? 0 : e.getSort())))
                .collect(Collectors.toList());
    }


}