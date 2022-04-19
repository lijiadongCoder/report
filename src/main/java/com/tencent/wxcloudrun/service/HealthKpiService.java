package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.HealthKpiDto;
import com.tencent.wxcloudrun.model.UserKpiDto;

import java.util.List;

public interface HealthKpiService {

  List<HealthKpiDto> getAll(String userId, Integer age);

  void save(List<UserKpiDto> userKpiDtoList);

  UserKpiDto getResult();
}
