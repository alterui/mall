package com.lr.controller.frontend;

import com.lr.entity.dto.MainPageInfoDTO;
import com.lr.entity.dto.Result;
import com.lr.service.combine.HeadLineCategoryCombineService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author liurui
 * @date 2020/8/30 9:45
 */
public class MainPageController {
    private HeadLineCategoryCombineService headLineCategoryCombineService;

    public Result<MainPageInfoDTO> getMainPageInfo(HttpServletRequest req, HttpServletResponse response) {
        return headLineCategoryCombineService.getMainPageInfoDTO();
    }

}
