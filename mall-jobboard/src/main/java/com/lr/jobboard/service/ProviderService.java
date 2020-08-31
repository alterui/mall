package com.lr.jobboard.service;

import com.lr.jobboard.model.ThirdpartyProvider;

import java.util.Map;

/**
 * @author liurui
 * @date 2020/8/28 10:43 上午
 */
public interface ProviderService {
    void bindAccount(Map<String, Object> params);

    ThirdpartyProvider getProviderInfo();
}
