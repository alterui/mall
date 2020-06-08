package com.lr.mall.test.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author liurui
 * @date 2020/6/3 4:43 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsSenderFormVO {


    String mobile;
    String templateCode;
    Map<String, String> params;

}