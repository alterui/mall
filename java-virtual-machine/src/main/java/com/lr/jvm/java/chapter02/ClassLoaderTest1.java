package com.lr.jvm.java.chapter02;

import sun.misc.Launcher;

import java.net.URL;
import java.util.stream.Stream;

/**
 * @author liurui
 * @date 2020/11/16 11:33 上午
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("******启动类加载器*******");
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        Stream.of(urLs).forEach(e -> System.out.println(e.toExternalForm()));

    }
}
