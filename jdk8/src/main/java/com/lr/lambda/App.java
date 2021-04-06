package com.lr.lambda;

import org.junit.Test;
import org.omg.CORBA.INTERNAL;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author liurui
 * @date 2021/4/4 18:22
 */
public class App {

    List<User> userList = Arrays.asList(
            new User(12, "zs", 888.0, User.Status.BUSY),
            new User(44, "ls", 666.0, User.Status.FREE),
            new User(15, "wz", 999.0, User.Status.BUSY),
            new User(9, "zq", 777.4, User.Status.VOCATION),
            new User(35, "tb", 555.0, User.Status.BUSY)

    );

    @Test
    public void test() {
        //1.通过Collection系列集合提供的Stream() 或parallelStream()
        List<Integer> list = new ArrayList<>();
        Stream<Integer> stream = list.stream();

        //2.通过Arrays中的静态方法stream()获取数组流
        Integer[] arr = new Integer[10];
        Stream<Integer> stream1 = Arrays.stream(arr);

        //3.通过Stream.of()方法
        Stream<Integer> arr1 = Stream.of(arr);
    }


    /**
     * 筛选与切片
     * 1.filter:接受lambda，从流中排除某些元素
     * 2.limit:截断流，使其元素不超过给定数量
     * 3.skip:跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流。与limit互补。
     * 4.distinct:筛选，通过流所生成的元素的hashcode()和equals()去除重复元素。
     */
    @Test
    public void test1() {
        // 1.filter:接受lambda，从流中排除某些元素
        userList.stream().filter(e -> e.getAge() > 35).collect(Collectors.toList()).forEach(System.out::println);

        //2.limit:截断流，使其元素不超过给定数量
        userList.stream().limit(2).collect(Collectors.toList()).forEach(System.out::println);

        //3.skip:跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流。与limit互补。
        userList.stream().skip(2).limit(1).collect(Collectors.toList()).forEach(System.out::println);

        //4.distinct:筛选，通过流所生成的元素的hashcode()和equals()去除重复元素。
        userList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
    }


    /**
     * 映射：
     * 1.map接收Lambda，将元素转换成其他形式或提取信息，接收一个函数作为参数，该函数会被应用到每个元素，并将其映射成一个新的元素。
     * 2.flatMap:接收一个函数作为参数，将流中的每个值都换成另外一个流，然后将所有流连接成一个流
     */
    @Test
    public void test2() {
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");
        list.stream()
                .map(e -> e.toUpperCase())
                .forEach(System.out::println);

        userList.stream().map(e -> e.getName())
                .forEach(System.out::println);

        System.out.println("------------------------------");

        list.stream().map(e -> getCharacterList(e)).collect(Collectors.toList());

        list.stream().flatMap(App::getCharacterList).forEach(System.out::println);
        System.out.println("------------------------");

        //扁平化处理，类似于list.addAll(list)
        list.stream().map(e -> e.split("")).flatMap(Arrays::stream).distinct().forEach(System.out::println);
        System.out.println("--------------");
        //类似于list.add(list)
        List<String[]> collect = list.stream().map(e -> e.split("")).distinct().collect(Collectors.toList());


    }

    public static Stream<Character> getCharacterList(String string) {
        List<Character> list = new ArrayList<>();
        for (Character character : string.toCharArray()) {
            list.add(character);
        }

        return list.stream();

    }

    /**
     *  排序：
     *  1.自然排序(Comparable)
     *  2.定制排序(Comparator)
     *
     */
    @Test
    public void test4() {
        userList.stream().sorted((e1,e2)->e1.getAge()-e2.getAge()).forEach(System.out::println);
    }


    /**
     * 规约：将流中的元素反复结合机器，得到一个值
     */
    @Test
    public void test5() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer num = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println(num);

        //reduce和map搭配使用进行求和
        Optional<Double> salary = userList.stream().map(e -> e.getSalary()).reduce(Double::sum);
        Double value = salary.orElse(0.0);
        System.out.println(value);


    }

    /**
     * 收集
     * collect:将流转换为其他形式。
     */
    @Test
    public void test6() {
        //转换成list
        List<String> name = userList.stream().map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(name);

        //转换成hashset
        HashSet<String> hashSet = userList.stream().map(e -> e.getName()).collect(Collectors.toCollection(HashSet::new));

        //计算count
        Long count = userList.stream().collect(Collectors.counting());
        System.out.println(count);

        //计算工资的平均值
        Double salary = userList.stream().collect(Collectors.averagingDouble(e -> e.getSalary()));
        System.out.println(salary);

        //分组
        Map<User.Status, List<User>> map = userList.stream().collect(Collectors.groupingBy(e -> e.getStatus()));
        map.forEach((k,v)->{
            System.out.println("K:" + k + "，V:" + v);
        });

        System.out.println("-------------------------------");

        //多级分组
        Map<Double, Map<Integer, List<User>>> doubleMapMap = userList.stream().collect(Collectors.groupingBy(e -> e.getSalary(), Collectors.groupingBy(e -> e.getAge())));

        //分区
        Map<Boolean, List<User>> booleanListMap = userList.stream().collect(Collectors.partitioningBy(e -> e.getSalary() > 900));

        booleanListMap.forEach((k,v)->{
            System.out.println("K:" + k + "，V:" + v);
        });

        //连接join
        String str = userList.stream().map(e -> e.getName()).collect(Collectors.joining(","));
        System.out.println(str);
    }

}
