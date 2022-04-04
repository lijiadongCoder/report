package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.HealthKpiDto;

import java.util.List;

public interface HealthKpiService {

  List<HealthKpiDto> getAll();
}
