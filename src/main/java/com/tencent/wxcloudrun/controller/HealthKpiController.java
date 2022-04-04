package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.HealthKpiDto;
import com.tencent.wxcloudrun.service.HealthKpiService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springboot-wxcloudrun
 * @description: HealthKpi
 * @author: ljd
 * @create: 2022/04/04
 */
@RestController
public class HealthKpiController {
    private Logger logger;

    @Autowired
    private HealthKpiService healthKpiService;


    /**
     * 查询全部数据
     * @return API response json
     */
    @PostMapping(value = "/healthKpi/getAll")
    ApiResponse getAll(@RequestBody HealthKpiDto healthKpiDto) {

        List<HealthKpiDto> list = healthKpiService.getAll();
        logger.info(list.toString());
        return ApiResponse.ok(list);
    }
}