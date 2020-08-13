package com.lr.concurrent.cv;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author mac
 * @date 2020/4/25
 */
@Data
public class CandidateAttachmentVO {

    /*
     * {
     *      "path": "/mnt/nfs/attachment/candidate_upload/8742847671ab11ea841400163e2ee5ff.pdf",
     *      "createTime": "2020-04-06 17:02:35",
     *      "profileId": 3720635,
     *      "name": "设施水处理技术员-周陈.pdf",
     *      "updateTime": "2020-04-06 17:02:35",
     *      "id": 333573
     * }
     */
    /**
     * cv附件存放路径
     */
    private String path;
    /**
     * 创建时间
     */
    private Timestamp createTime;
    /**
     * 修改时间
     */
    private Timestamp updateTime;
    /**
     * 原始简历主键
     */
    private Integer profileId;
    /**
     * cv简历名称,无特殊情况应与profileName一致
     */
    private String name;
    /**
     * 申请id
     */
    private Integer applicationId;
}
