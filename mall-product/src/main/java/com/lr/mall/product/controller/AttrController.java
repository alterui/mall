package com.lr.mall.product.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    private MemberFeginService feginService;
    @GetMapping("/get")
    public void get() {
        MemberEntity memberEntity = new MemberEntity();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);

        memberEntity.setList(list);
        memberEntity.setCity("sx");

        feginService.list(list, memberEntity.getCity());
        System.out.println();
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
