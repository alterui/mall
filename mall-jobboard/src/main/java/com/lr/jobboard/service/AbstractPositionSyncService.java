package com.lr.jobboard.service;

import com.lr.jobboard.model.AbstractThirdPartyPosition;
import com.lr.jobboard.model.BaseChannelForm;
import com.lr.jobboard.model.ThirdpartyProvider;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * @author liurui
 * @date 2020/8/28 10:59 上午
 */
public abstract class AbstractPositionSyncService<T extends AbstractThirdPartyPosition, F extends BaseChannelForm> implements PositionSyncService {

    @Override
    public void executeTasks() {

    }

    @Override
    public void withdraw() {

    }

    @Override
    public void delete() {
        Type type = getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type actualTypeArgument = actualTypeArguments[0];
        String typeName = actualTypeArgument.getTypeName();
        System.out.println(typeName);
        Type form = actualTypeArguments[1];


    }

    @Override
    public void bindAccount(Map<String, Object> params) {

    }

    @Override
    public ThirdpartyProvider getProviderInfo() {
        return null;
    }

    protected abstract void setChannelInfo(T thirdPosition,F cha);
}
