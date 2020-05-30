package com.lr.mall.coupon;

import com.lr.mall.coupon.entity.MemberPriceEntity;
import com.lr.mall.coupon.service.MemberPriceService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class MallCouponApplicationTests {


    @Autowired
    MemberPriceService memberPriceService;
    @Test
    void contextLoads() {

        MemberPriceEntity memberPriceEntity = new MemberPriceEntity();
        memberPriceEntity.setMemberLevelName("V8等级");
        memberPriceService.save(memberPriceEntity);

    }

}
