package com.lr.pattern.controller;

import com.lr.pattern.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liurui
 * @date 2020/6/12 2:31 下午
 */
@RestController
public class IndexController {

    @Autowired
    IndexService indexService;

    @GetMapping("/index")
    public Object getMenus(@RequestParam Integer version) {
        Object menu = indexService.getMenu(version);
        return menu;
    }

}
