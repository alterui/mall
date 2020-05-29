package com.lr.mall.product;

import com.lr.mall.product.entity.BrandEntity;
import com.lr.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;

@SpringBootTest
@RunWith(SpringRunner.class)
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");

        boolean save = brandService.save(brandEntity);

        System.out.println(save);
    }

}
