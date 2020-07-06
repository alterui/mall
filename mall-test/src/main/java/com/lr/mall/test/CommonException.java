package com.lr.mall.test;

import com.lr.mall.test.bean.SmsSenderFormVO;
import lombok.Data;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liurui
 * @date 2020/6/3 3:11 下午
 */
@Data
@RestController
public class CommonException<T> {

    private T code;
    private T msg;

    @PutMapping("/hi")
    public void test(@RequestBody SmsSenderFormVO smsSenderFormVO) {
        System.out.println(smsSenderFormVO.toString());
    }
}


