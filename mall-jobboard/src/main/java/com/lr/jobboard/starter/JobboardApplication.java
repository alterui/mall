package com.lr.jobboard.starter;

import com.lr.jobboard.model.Channel;
import com.lr.jobboard.model.LinkinChannel;

/**
 * @author liurui
 * @date 2020/8/27 6:42 下午
 */
public class JobboardApplication {
    public static void main(String[] args) {
        Channel channel = new LinkinChannel();
        channel.get();
    }
}
