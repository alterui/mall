package com.lr.service.combine;

import com.lr.entity.dto.MainPageInfoDTO;
import com.lr.entity.dto.Result;

import java.util.List;

/**
 * @author liurui
 * @date 2020/8/29 23:50
 */
public interface HeadLineCategoryCombineService {
     Result<MainPageInfoDTO> getMainPageInfoDTO();
}
