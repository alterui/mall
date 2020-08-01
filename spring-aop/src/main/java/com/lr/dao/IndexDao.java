package com.lr.dao;

import org.springframework.stereotype.Repository;

/**
 * @author liurui
 * @date 2020/8/1 15:18
 */
@Repository
public class IndexDao {
    public void query(String a,Integer b){
        System.out.println("query2");

    }

    public void query(String a){
        System.out.println("query1");

    }

    public void query(){
        System.out.println("query3");

    }
}
