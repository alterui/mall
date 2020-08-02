package com.lr.dao;

import org.springframework.stereotype.Repository;

/**
 * @author liurui
 * @date 2020/8/1 15:18
 */
@Repository
public class IndexDao implements Dao {

    @Override
    public void query() {
        System.out.println("query1");
    }

    @Override
    public void query(String a) {
        int i = 5 / Integer.parseInt(a);


        System.out.println(a);
    }
}
