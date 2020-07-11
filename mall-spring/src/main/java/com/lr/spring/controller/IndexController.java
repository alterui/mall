package com.lr.spring.controller;

import com.lr.spring.bean.Student;
import lombok.SneakyThrows;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author liurui
 * @date 2020/7/9 10:35 上午
 */
public class IndexController {


   static ExecutorService service = new ThreadPoolExecutor(0, 1000,
            60L, TimeUnit.SECONDS,
            new SynchronousQueue<Runnable>());


    public static void main(String[] args) {


        for (int i = 0; i < 1; i++) {


                List<Student> students = getList();
               /* Map<Integer, Student> map = students
                        .stream()
                        .collect(Collectors.toMap(Student::getAge, Function.identity(), (a, b) -> b));*/
       /* Map<Integer, String> map = students.
                stream()
                .filter(e->Objects.nonNull(e.getAge()))
                .collect(Collectors.toMap(e -> e.getAge(), e -> e.getCity(), (a, b) -> b));*/


                Map<Integer, List<Student>> map = students
                        .stream()
                        .filter(e->Objects.nonNull(e.getAge()))
                        .collect(Collectors.groupingBy(e -> e.getAge()));
                map.forEach((k, v) -> {
                    System.out.println("K:" + k + ",v:" + v);
                });

                System.out.println("============================");

       /* Map<Integer, List<Student>> ageWithStudentMap = students.stream().filter(e->Objects.nonNull(e.getAge())).collect(Collectors.groupingBy(e -> e.getAge()));

        ageWithStudentMap.forEach((k,v)->{
            System.out.println("k:" + k + ",v" + v.toString());
        });

        System.out.println(ageWithStudentMap.get(11));

        System.out.println("===============================");


        Map<Integer, Student> studentMap = students.stream().collect(Collectors.toMap(e -> e.getAge(), v -> v, (a, b) -> b));
        studentMap.forEach((k,v)->{
            System.out.println("k:"+k+",v:"+v.toString());
        });

        System.out.println("==============================");


        List<Integer> collect = students.stream().map(e -> e.getAge()).collect(Collectors.toList());
        collect.forEach(System.out::println);*/

        }




    }




    static List<Student> getList() {
        List<Student> students = new ArrayList<>();



        students.add(new Student(getUUID(), 10, "tom","sh",1));
        students.add(new Student(getUUID(), 11, "li","xz",1));
        students.add(new Student(getUUID(), 12, "liu","nj",2));
        students.add(new Student(getUUID(), 13, "riu","bj",3));
        students.add(new Student(getUUID(), 11, "wang","sh",4));
        students.add(new Student());
        students.add(new Student());
        //students.forEach(System.out::println);
        return students;

    }
    static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }




}
