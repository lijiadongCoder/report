package com.tencent.wxcloudrun.controller;

import com.alibaba.fastjson.JSON;
import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.HealthKpiDto;
import com.tencent.wxcloudrun.model.UserKpiDto;
import com.tencent.wxcloudrun.service.HealthKpiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
     * 分页查询数据
     * @return API response json
     */
    @GetMapping(value = "/healthKpi/getAll")
    ApiResponse getAll(@RequestParam("age") Integer age) {
        //写死用户先
        String userId = "20220310001";

        List<HealthKpiDto> list = healthKpiService.getAll(userId, age);
        logger.info(list.toString());
        return ApiResponse.ok(JSON.toJSONString(list));
    }

    /**
     * 提交答题
     * @return API response json
     */
    @PostMapping(value = "/healthKpi/save")
    ApiResponse save(@RequestBody List<UserKpiDto> userKpiDtoList) {

        healthKpiService.save(userKpiDtoList);
        return ApiResponse.ok(JSON.toJSONString(0));
    }

    /**
     * 查看统计结果
     * @return API response json
     */
    @PostMapping(value = "/healthKpi/getResult")
    ApiResponse getResult() {

        List<UserKpiDto> userKpiDto = healthKpiService.getResult();
        return ApiResponse.ok(JSON.toJSONString(userKpiDto));
    }




}
