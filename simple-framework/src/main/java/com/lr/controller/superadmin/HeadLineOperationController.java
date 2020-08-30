package com.lr.controller.superadmin;

import com.lr.entity.bo.HeadLine;
import com.lr.entity.dto.Result;
import com.lr.service.solo.HeadLineService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author liurui
 * @date 2020/8/30 9:47
 */
public class HeadLineOperationController {
    private HeadLineService headLineService;

    public Result<Boolean> addHeadLine(HttpServletRequest req, HttpServletResponse response) {
        return headLineService.addHeadLine(new HeadLine());
    }


    public Result<Boolean> removeHeadLine(HttpServletRequest req, HttpServletResponse response) {
        return headLineService.removeHeadLine(1);
    }


    public Result<Boolean> modifyHeadLine(HttpServletRequest req, HttpServletResponse response) {
        return headLineService.modifyHeadLine(new HeadLine());
    }

    public Result<HeadLine> queryHeadLineById(HttpServletRequest req, HttpServletResponse response) {
        return headLineService.queryHeadLineById(1);
    }

    public Result<List<HeadLine>> queryHeadLine(HttpServletRequest req, HttpServletResponse response) {
        return headLineService.queryHeadLine(null, 1, 100);
    }

}
