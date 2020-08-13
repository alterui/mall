package com.lr.concurrent.cv;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author yehu
 * date 2020-02-28 18:22
 */
@Data
@ApiModel("候选人简历")
public class CandidateProfileVO {

    @ApiModelProperty("主键id (ObjectId)")
    private String id;

    @ApiModelProperty("公司id")
    private Integer companyId;

    @ApiModelProperty("候选人简历-摘要信息--基本身份信息")
    private OverviewVO overview;

    @ApiModelProperty("候选人简历-个人信息")
    private BasicVO basic;

    @ApiModelProperty("候选人简历-求职意向")
    private IntentionVO intention;

    @ApiModelProperty("候选人简历-工作经历-多个")
    private List<WorkExperienceVO> workExperiences;

    @ApiModelProperty("候选人简历-教育经历-多个")
    private List<EducationVO> educations;

    @ApiModelProperty("候选人简历-项目经验")
    private List<ProjectExperienceVO> projectExperiences;

    @ApiModelProperty("候选人简历-语言能力")
    private List<LanguageVO> languages;

    @ApiModelProperty("候选人简历-技能标签")
    private List<SkillVO> skills;

    @ApiModelProperty("候选人简历-获得奖项")
    private List<AwardVO> awards;

    @ApiModelProperty("候选人简历-个人作品")
    private List<WorkVO> works;

    @ApiModelProperty("候选人简历-个人证书")
    private List<CertificateVO> certificates;

    //    private Integer applicationId;

    /**
     * candidateProfile对应的原始简历id
     */
    private Integer profileId;
    /**
     * candidateProfile对应的用户id
     */
    private Integer userId;

    private String candidateProfileId;

    /**
     * candidateOther合并后的other信息
     */
    private String mergedOtherJson;

    /**
     * 合并后的申请表模块(所有字段)
     */
    private List<FormGroupVO> mergedFormGroups;

    /**
     * 公司下的自定义分组
     */
    private List<FormGroupVO> customFormGroups;
}
