package com.lr.pattern.singleton;

/**
 * 饿汉单例模式
 * @author liurui
 * @date 2020/9/29 4:48 下午
 */

public class StarvingSingleton {
    private static final StarvingSingleton STARVING_SINGLETON = new StarvingSingleton();
    private StarvingSingleton() {

    }

    public static StarvingSingleton getInstance() {
        return STARVING_SINGLETON;
    }

    public static void main(String[] args) {
        System.out.println(StarvingSingleton.getInstance());
        System.out.println(StarvingSingleton.getInstance());
        System.out.println(StarvingSingleton.getInstance());
    }
}
