package com.lr.concurrent.cv;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author yehu
 * date 2020-03-01 15:41
 */
@Data
@ApiModel("候选人简历-职位模版信息")
public class CandidateOtherVO {

    @ApiModelProperty("other主键")
    private String id;

    @ApiModelProperty("other信息(json字符串)")
    private String otherJSON;

    @ApiModelProperty("申请表字段")
    private List<FormGroupVO> formGroups;


}
