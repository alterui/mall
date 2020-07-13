package com.lr.service;

import com.lr.dao.IndexDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liurui
 * @date 2020/7/4 16:51
 */

@Service
public class IndexService {

    /**
     * atuowired是根据tepe自动装配的
     */
    @Autowired
    private final IndexDao indexDao;

    public IndexService(IndexDao indexDao) {
        this.indexDao = indexDao;
    }
    public void test() {
        indexDao.test();
    }


}
