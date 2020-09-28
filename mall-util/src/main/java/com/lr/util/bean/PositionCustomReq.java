package com.lr.util.bean;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

/**
 * @author liurui
 * @date 2020/9/23 2:31 下午
 */
@Data
public class PositionCustomReq implements Serializable {
    private Integer id;
    private Integer companyId;
    private Integer type;
    @Length(max = 50,message = "自定义标题长度不能超过50")
    @NotBlank(message = "自定义标题不能为空")
    private String name;



}
