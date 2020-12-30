package com.lr.util.controller;

import com.lr.util.bean.PositionCustomReq;
import com.lr.util.bean.Result;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;


/**
 * @author liurui
 * @date 2020/9/23 2:37 下午
 */
@RestController
public class IndexController {

    @PostMapping("/get")
    public Result get(@RequestBody Map<String,String> params) {
        String s = params.get("id");
        System.out.println(s);
        return Result.getSuccessResult();
    }


    @GetMapping("/get1")
    public Result get1( @Valid PositionCustomReq positionCustomReq) {
        System.out.println(positionCustomReq);
        return Result.getSuccessResult();
    }
}
