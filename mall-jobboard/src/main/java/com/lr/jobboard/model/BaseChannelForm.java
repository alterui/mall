package com.lr.jobboard.model;

import lombok.Data;

import java.util.List;

/**
 * @author liurui
 * @date 2020/8/28 11:03 上午
 */
@Data
public class BaseChannelForm {
    private int channel;

    private String operation;

    private Integer salaryTop;

    private Integer salaryBottom;

    private Integer count;

    private boolean isCrx;

    private List<List<String>> occupations;

    private List<ChannelAddress> addresses;

    public BaseChannelForm() {
        this.isCrx = false;
    }

    @Data
    public static class ChannelAddress{

        private Integer cityCode;

        private String cityName;

        private String city;

        private Long addressId;

        private String addressName;
    }
}
