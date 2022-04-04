package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.HealthKpiMapper;
import com.tencent.wxcloudrun.model.HealthKpiDto;
import com.tencent.wxcloudrun.service.HealthKpiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthKpiServiceImpl implements HealthKpiService {

  @Autowired
  private HealthKpiMapper healthKpiMapper;


  @Override
  public List<HealthKpiDto> getAll() {
    return healthKpiMapper.getAll();
  }
}
