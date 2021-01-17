package com.lr.jvm.java.chapter04;

/**
 * 测试：大对象直接进去老年代
 * -Xms60m -Xmx60m -XX:NewRatio=2 -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 * @author liurui
 * @date 2020/11/17 10:53 上午
 */
public class YoungOldAreaTest {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024 * 1024 * 13];
    }

}
