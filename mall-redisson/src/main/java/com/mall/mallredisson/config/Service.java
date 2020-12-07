package com.mall.mallredisson.config;

import com.mall.mallredisson.controller.Mapper;
import com.mall.mallredisson.controller.OptTieInReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liurui
 * @date 2020/11/25 3:33 下午
 */
@Component
public class Service {

    @Autowired
    Mapper mapper ;

    public void getOptTie(OptTieInReq optTieInReq) {


        mapper.getOptTieByCondition(optTieInReq.getResId(),optTieInReq.getSupportId(),optTieInReq.getWoId());
    }
}
