package com.lr.service;

import com.lr.dao.IndexDao;

/**
 * @author liurui
 * @date 2020/7/4 16:51
 */
public class IndexService {
    private IndexDao indexDao;
    public void test() {
        indexDao.test();
    }

    public void setIndexDao(IndexDao indexDao) {
        this.indexDao = indexDao;
    }
}
