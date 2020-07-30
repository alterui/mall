package com.lr.spring.service;

import com.lr.spring.job.AbstractBindProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author liurui
 * @date 2020/7/29 11:44 上午
 */
@Service
public class BindService {
    @Autowired
    List<AbstractBindProcessor> bindProcessorList;


    public AbstractBindProcessor getChannel() {
        Optional<AbstractBindProcessor> meituan = bindProcessorList.stream().filter(e -> e.getMsg().equals("meituan")).findFirst();
        return meituan.orElse(null);
    }
}
