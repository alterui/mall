package com.lr.mall.test1;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liurui
 * @date 2021/3/30 4:04 下午
 */
public class App {
    public static void main(String[] args) {
        User1 user1 = new User1();


        List<User2> user2List = new ArrayList<>();
        User2 user2 = new User2(2);
        User2 user3 = new User2(3);
        User2 user4 = new User2(4);
        user2List.add(user2);
        user2List.add(user3);
        user2List.add(user4);

        user1.setList2(user2List);

        System.out.println(JSON.toJSONString(user1));


    }
}
