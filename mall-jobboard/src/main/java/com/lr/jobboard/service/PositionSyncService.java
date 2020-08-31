package com.lr.jobboard.service;

import com.lr.jobboard.model.ThirdpartyProvider;

/**
 * @author liurui
 * @date 2020/8/28 10:52 上午
 */
public interface PositionSyncService extends ProviderService {
    void executeTasks();
    void withdraw();
    void delete();
}
