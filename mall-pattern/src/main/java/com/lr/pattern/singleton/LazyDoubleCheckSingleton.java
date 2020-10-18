package com.lr.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/**
 * @author liurui
 * @date 2020/9/29 6:13 下午
 */
public class LazyDoubleCheckSingleton {

    //禁止重排序
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton;
    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        //第一重检查：是由于加锁性能，每次获取对象都要进行加锁，

        if (Objects.isNull(lazyDoubleCheckSingleton)) {
            synchronized (LazyDoubleCheckSingleton.class) {
                //第二重检查：多个线程执行到第一个判断之后，会依次执行加锁，所以会创建过个实例
                if (Objects.isNull(lazyDoubleCheckSingleton)) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }


    public static void main(String[] args) throws Exception {
        System.out.println(LazyDoubleCheckSingleton.getInstance());
        System.out.println(LazyDoubleCheckSingleton.getInstance());

        Class<LazyDoubleCheckSingleton> lazyDoubleCheckSingletonClass = LazyDoubleCheckSingleton.class;
        Constructor<LazyDoubleCheckSingleton> constructor = lazyDoubleCheckSingletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = constructor.newInstance();
        System.out.println(lazyDoubleCheckSingleton);

        System.out.println("==========");
        Integer integer1 = new Integer(2);
        Integer integer2 = new Integer(2);
        System.out.println(integer1 == integer2);
        System.out.println(integer1.equals(integer2));
    }

    @Override
    public boolean equals(Object obj) {
            return super.equals(obj);
    }
}
