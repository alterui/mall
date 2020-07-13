package com.lr.dao.impl;

import com.lr.dao.IndexDao;
import org.springframework.stereotype.Repository;

/**
 * @author liurui
 * @date 2020/7/4 16:15
 */
@Repository
public class IndexDaoImpl implements IndexDao {
    @Override
    public void test() {
        System.out.println("impl");
    }
}
