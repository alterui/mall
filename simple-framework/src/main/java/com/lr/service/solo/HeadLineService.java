package com.lr.service.solo;

import com.lr.entity.bo.HeadLine;
import com.lr.entity.dto.Result;

import java.util.List;

/**
 * @author liurui
 * @date 2020/8/29 23:41
 */
public interface HeadLineService {
    Result<Boolean> addHeadLine(HeadLine headLine);

    Result<Boolean> removeHeadLine(Integer headLineId);

    Result<Boolean> modifyHeadLine(HeadLine headLine);

    Result<HeadLine> queryHeadLineById(Integer headLineId);

    Result<List<HeadLine>> queryHeadLine(HeadLine headLineCondition, Integer pageIndex, Integer pageSize);
}
