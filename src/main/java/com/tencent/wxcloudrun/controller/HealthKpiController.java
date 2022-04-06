package com.tencent.wxcloudrun.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.HealthKpiDto;
import com.tencent.wxcloudrun.service.CounterService;
import com.tencent.wxcloudrun.service.HealthKpiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    final HealthKpiService healthKpiService;
    final Logger logger;

    public HealthKpiController(@Autowired HealthKpiService healthKpiService) {
        this.healthKpiService = healthKpiService;
        this.logger = LoggerFactory.getLogger(HealthKpiService.class);
    }


    /**
     * 查询全部数据
     * @return API response json
     */
    @PostMapping(value = "/healthKpi/getAll")
    ApiResponse getAll() {
        logger.error("into");
        List<HealthKpiDto> list = healthKpiService.getAll();
        logger.info(list.toString());
        return ApiResponse.ok(JSONArray.parseArray(JSON.toJSONString(list)));
    }
}
