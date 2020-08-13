package com.lr.concurrent.cv;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mac
 * @date 2020/4/16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CandidateProfileQueryVO {

    /**
     * candidateProfile的ObjectId
     */
    private String objectId;

    /**
     * 申请id
     */
    private Integer applicationId;
}
