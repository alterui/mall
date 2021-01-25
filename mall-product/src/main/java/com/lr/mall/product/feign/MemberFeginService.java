package com.lr.mall.product.feign;

import com.lr.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author liurui
 * @date 2020/8/6 22:35
 */
@FeignClient(name = "mall-member")
public interface MemberFeginService {
    @RequestMapping("member/growthchangehistory/list")
    MemberEntity list(@RequestParam("list") List<Integer> list,
                      @RequestParam("city") String city);
}
