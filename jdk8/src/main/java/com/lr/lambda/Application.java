package com.lr.lambda;

import com.sun.javafx.image.IntPixelGetter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author liurui
 * @date 2021/3/27 9:42
 */
public class Application {

    @Test
    public void test1() {
        List<User> userList = Arrays.asList(
                new User(12, "zs", 888.0, User.Status.BUSY),
                new User(44, "ls", 666.0,User.Status.FREE),
                new User(15, "wz", 999.0,User.Status.BUSY),
                new User(9, "zq", 777.4,User.Status.VOCATION),
                new User(35, "tb", 555.0,User.Status.BUSY)

        );
        List<User> list = filterAge(userList, new UserAgeFilter());
        list.forEach(System.out::println);


    }

    public List<User> filterAge(List<User> userList, MyComparator<User> myComparator) {
        List<User> list = new ArrayList<User>();
        for (User user : userList) {
            if (myComparator.comparator(user)) {
                list.add(user);
            }
        }
        return list;
    }

    @Test
    public void test2() {
        Consumer<String> tConsumer = x -> System.out.println(x);
        tConsumer.accept("我是大好人");

    }

    @Test
    public void test3() {
        Integer operation = operation(2, x -> x + 3);
        System.out.println(operation);
    }

    public Integer operation(Integer num, MyFunction<Integer> myFunction) {
        return myFunction.getValue(num);
    }


    @Test
    public void Test5() {
        buy(10.00, e-> System.out.println("消费："+e+"元!"));
    }

    public void buy(Double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }

    @Test
    public void test6() {
        List<Integer> numList = getNumList(() -> (int) (Math.random() * 10));
        numList.forEach(System.out::println);
    }

    public List<Integer> getNumList(Supplier<Integer> supplier) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(supplier.get());
        }
        return list;
    }

    @Test
    public void test7() {
        // s表示传参，s.length()表示返回值
        Integer length = getLength("sdfsfsa", s -> s.length());
        System.out.println(length);
    }

    public Integer getLength(String str, Function<String, Integer> function) {
       return function.apply(str);
    }


    @Test
    public void test8() {
        List<String> stringList = Arrays.asList("ni", "hao", "wwww", "hello", "tom");


        List<String> resultList = filterStr(stringList, s -> s.length() > 3);
        resultList.forEach(System.out::println);
    }
    public List<String> filterStr(List<String> list, Predicate<String> predicate) {
        List<String> resultList = new ArrayList<>();
        list.forEach(e->{
            if (predicate.test(e)) {
                resultList.add(e);
            }
        });

        return resultList;
    }

    @Test
    public void test9() {
        Supplier<User> userSupplier = User::new;

        System.out.println(userSupplier.get());


    }

    @Test
    public void test10() {
        List<Integer> list = Arrays.asList(1, 2, 4, 5);
        List list2 = new ArrayList();
        list2.add(132131);
        list2.addAll(list);

        list2.forEach(System.out::println
        );
    }






}
