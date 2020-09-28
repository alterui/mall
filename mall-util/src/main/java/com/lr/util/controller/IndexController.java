package com.lr.util.controller;

import com.lr.util.bean.PositionCustomReq;
import com.lr.util.bean.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


/**
 * @author liurui
 * @date 2020/9/23 2:37 下午
 */
@RestController
public class IndexController {

    @GetMapping("/get")
    public Result get(@Valid PositionCustomReq positionCustomReq) {
        System.out.println(positionCustomReq);
        return Result.getSuccessResult();
    }

}
