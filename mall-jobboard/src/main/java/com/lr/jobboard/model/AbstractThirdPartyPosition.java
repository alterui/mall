package com.lr.jobboard.model;

import lombok.Data;

/**
 * @author liurui
 * @date 2020/8/28 11:00 上午
 */
@Data
public abstract class AbstractThirdPartyPosition {
    private int positionId;

    private int channel;

    private int thirdPartyAccountId;

    private int cityCode;

    private transient String cityName;

    private String jobBoardId;

    private String url;

    private int companyId;

    private int publisher;

    private String sign;

    private String title;

    private Integer salaryTop;

    private Integer salaryBottom;

    private Integer count;

    private Byte candidateSource;

    private String form;
}
