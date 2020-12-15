package com.lr.util.bean;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    @NotBlank(message = "不能为空")
    private String name;


}
