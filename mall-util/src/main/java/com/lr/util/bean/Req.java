package com.lr.util.bean;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liurui
 * @date 2021/2/1 11:06 上午
 */
@Data
public class Req {
   private List<User> list;
   private Result info;

    public static void main(String[] args) {
        Req req = new Req();
        ArrayList<User> objects = new ArrayList<>();
        objects.add(new User(1, 3));
        objects.add(new User(1, 3));
        objects.add(new User(1, 3));
        objects.add(new User(1, 3));


        req.setList(objects);

        req.setInfo(new Result("1", "3"));

        System.out.println(JSON.toJSONString(req));
    }
}
