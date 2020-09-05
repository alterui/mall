package com.lr.jobboard.model;

/**
 * @author liurui
 * @date 2020/8/27 6:41 下午
 */
public abstract class Channel {


    protected abstract void setChannelInfo();

    public void get() {
        setChannelInfo();

    }

}
