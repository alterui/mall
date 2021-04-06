package com.lr.mall;

import com.lr.mall.controller.Student;
import com.lr.mall.controller.StudentVO;
import org.checkerframework.checker.units.qual.A;

import java.sql.Timestamp;
import java.util.*;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.Collectors;

/**
 * @author liurui
 * @date 2021/3/3 11:24 上午
 */
public class App {
    public static void main(String[] args) {
        String a = "avs";
        String b = "a";
        if (a.contains(b)){
            System.out.println(a);
        }
        if (b.contains(a)){
            System.out.println(b);
        }
    }






}
