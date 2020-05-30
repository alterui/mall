package com.lr.mall.product.feign;

import com.lr.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liurui
 * @date 2020/5/30 16:58
 */
@FeignClient(name = "mall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/memberprice/info/{id}")
    R info(@PathVariable("id") Long id);
}
