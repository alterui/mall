package com.lr.mall.reflect;

import lombok.Data;

/**
 * @author liurui
 * @date 2020/7/30 3:43 下午
 */
@ThirdProvider("aon")
@Data
public class AonAccount {
    @ThirdAccountFormItem(name = "aon",type = "INPUT", text = "clientId", rules = {"required"})
    private String clientId;

    @ThirdAccountFormItem(name = "aon", type = "INPUT", text = "secureCode", rules = {"required"})
    private String secureCode;
}
