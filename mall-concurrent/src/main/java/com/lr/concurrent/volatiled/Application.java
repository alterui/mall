package com.lr.concurrent.volatiled;

/**
 * @author liurui
 * @date 2020/8/18 2:19 下午
 */
public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            System.out.println(ExUtils.getThreadPools().toString());
        }
    }
}
