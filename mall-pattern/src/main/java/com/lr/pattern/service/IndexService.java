package com.lr.pattern.service;

import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

/**
 * @author liurui
 * @date 2020/6/22 4:15 下午
 */

public interface IndexService {
    Object getMenu(Integer version);
}
