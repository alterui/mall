package com.lr.spring.test;

import com.lr.spring.bean.Student;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;

/**
 * @author liurui
 * @date 2020/7/10 5:24 下午
 */
public class MapTest {
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(1, 34));
        list.add(new Student(2, 32));
        list.add(new Student(3, 32));
        list.add(new Student(4, 32));
        list.add(new Student(5, 32));
        list.add(new Student(6, 32));
        list.add(new Student(7, 32));
        list.add(new Student(8, 32));
        list.add(new Student(9, 32));
        list.add(new Student(10, 32));
        list.add(new Student(11, 32));
        list.add(new Student(12, 32));
        list.add(new Student(13, 32));
        list.add(new Student(14, 32));
        list.add(new Student(15, 32));
        list.add(new Student(16, 32));
        list.add(new Student(17, 32));
        list.add(new Student(18, 32));
        list.add(new Student(19, 32));
        list.add(new Student(20, 32));


        System.out.println("list size=" + list.size());


        //Map<Integer, Integer> mapValue = list.parallelStream().collect(Collectors.toMap(e -> e.getAge(), e -> e.getSize(), (a, b) -> a));
        //
        list.parallelStream().forEach(e->{
            map.put(e.getAge(), e.getSize());
            try {
                Thread.sleep(200);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }

        });

        System.out.println("map size="+map.size());




    }

}
