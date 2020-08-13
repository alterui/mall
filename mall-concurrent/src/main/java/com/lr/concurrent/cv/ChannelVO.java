package com.lr.concurrent.cv;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author yehu
 * date 2020-02-28 19:18
 */
@Data
@ApiModel("候选人简历-渠道信息")
public class ChannelVO {

    private String category;

    private Integer channelId;

    private String channelName;

    private String code;

    private Integer sourceId;

    private String sourceName;
}
