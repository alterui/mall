package com.lr.service;

import com.lr.dao.IndexDao;

/**
 * @author liurui
 * @date 2020/7/4 16:51
 */
public class IndexService {
    private final IndexDao indexDao;

    public IndexService(IndexDao indexDao) {
        this.indexDao = indexDao;
    }
    public void test() {
        indexDao.test();
    }


}
