package com.lr.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author liurui
 * @date 2021/4/4 14:27
 */
public class App2 {

    List<User> userList = Arrays.asList(
            new User(12, "zs", 888.0, User.Status.BUSY),
            new User(44, "ls", 666.0,User.Status.FREE),
            new User(15, "wz", 999.0,User.Status.BUSY),
            new User(9, "zq", 777.4,User.Status.VOCATION),
            new User(35, "tb", 555.0,User.Status.BUSY)

    );

    /**
     *  查找与匹配
     *  1.allMatch:检查是否匹配所有元素
     *  2.anyMatch:检查是否至少匹配一个元素
     *  3.noneMatch:检查是否没有匹配所有元素
     *  4.findFirst:返回第一个元素
     *  5.findAny:返回当前流中任意元素
     *
     *  6.count:返回当前流中元素的总个数
     *  7.返回流中最大值
     *  8.返回流中最小值
     */
    @Test
    public void test1() {
        // 1.allMatch:检查是否匹配所有元素
        boolean b = userList.stream().allMatch(e -> e.getStatus().equals(User.Status.BUSY));
        System.out.println(b);

        //2.anyMatch:检查是否至少匹配一个元素
        boolean b1 = userList.stream().anyMatch(e -> e.getStatus().equals(User.Status.BUSY));
        System.out.println(b1);

        //3.noneMatch:检查是否没有匹配所有元素
        boolean b2 = userList.stream().noneMatch(e -> e.getStatus().equals(User.Status.BUSY));
        System.out.println(b2);

        //4.findFirst:返回第一个元素
        Optional<User> user = userList.stream().sorted((k, v) -> -Double.compare(k.getSalary(), v.getSalary())).findFirst();
        System.out.println(user.get());

        // 5.findAny:返回当前流中任意元素
        Optional<User> any = userList.stream().filter(e->e.getStatus().equals(User.Status.BUSY)).findAny();
        System.out.println(any.get());

        //6.count:返回当前流中元素的总个数
        System.out.println(userList.stream().count());

        // 7.返回流中最大值
        Optional<User> max = userList.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(max.get());

        //8.返回流中最小值
        Optional<User> min = userList.stream().min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(min.get());
    }
}
