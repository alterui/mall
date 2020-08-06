package com.lr.mall.product.controller;

import java.util.Arrays;
import java.util.Map;


import com.lr.mall.product.feign.MemberEntity;
import com.lr.mall.product.feign.MemberFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lr.mall.product.entity.AttrEntity;
import com.lr.mall.product.service.AttrService;
import com.lr.common.utils.PageUtils;
import com.lr.common.utils.R;



/**
 * 商品属性
 *
 * @author liurui
 * @email liurui@gmail.com
 * @date 2020-05-29 22:35:31
 */
@RestController
@RequestMapping("product/attr")
public class AttrController {
    @Autowired
    private AttrService attrService;

    @Autowired
    private MemberFeginService memberFeginService;

    @PostMapping("/get")
    public void get(@RequestBody MemberEntity entity) {
        System.out.println(entity);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:attr:list")
    public MemberEntity list(@RequestParam Map<String, Object> params){
        MemberEntity list = memberFeginService.list();
        System.out.println(list);
        return list;
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{attrId}")
    //@RequiresPermissions("product:attr:info")
    public R info(@PathVariable("attrId") Long attrId){
		AttrEntity attr = attrService.getById(attrId);

        return R.ok().put("attr", attr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:attr:save")
    public R save(@RequestBody AttrEntity attr){
		attrService.save(attr);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:attr:update")
    public R update(@RequestBody AttrEntity attr){
		attrService.updateById(attr);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:attr:delete")
    public R delete(@RequestBody Long[] attrIds){
		attrService.removeByIds(Arrays.asList(attrIds));

        return R.ok();
    }

}
