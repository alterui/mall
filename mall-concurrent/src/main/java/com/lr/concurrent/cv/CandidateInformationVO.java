package com.lr.concurrent.cv;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author yehu
 * date 2020-03-15 18:24
 */
@ApiModel("候选人信息")
@Data
public class CandidateInformationVO {

    private CandidateProfileVO candidateProfile;

    private String otherJson;

    private String attachment;
}
