package com.lr.pattern.strategy;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author liurui
 * @date 2020/6/22 4:28 下午
 */
@Component
public class MenuSettingStrategyFactory {
    private static final Map<Integer, AbstractMenuStrategy> strategyMap = new ConcurrentHashMap<>();

    public static void register(Integer edition, AbstractMenuStrategy abstractMenuStrategy) {
        strategyMap.put(edition, abstractMenuStrategy);
    }

    public static AbstractMenuStrategy getStrategy(Integer edition) {
        return strategyMap.get(edition);
    }



}
