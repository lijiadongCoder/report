package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.HealthKpiMapper;
import com.tencent.wxcloudrun.model.HealthKpiDto;
import com.tencent.wxcloudrun.model.UserKpiDto;
import com.tencent.wxcloudrun.service.HealthKpiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HealthKpiServiceImpl implements HealthKpiService {

  final HealthKpiMapper healthKpiMapper;
  public HealthKpiServiceImpl(@Autowired HealthKpiMapper healthKpiMapper) {
    this.healthKpiMapper = healthKpiMapper;
  }

  @Override
  public List<HealthKpiDto> getAll(String userId, Integer age) {
    HealthKpiDto healthKpiDtoQuery = new HealthKpiDto();
    healthKpiDtoQuery.setUserId(userId);
    healthKpiDtoQuery.setMonthAge(age);
    return healthKpiMapper.getAll(healthKpiDtoQuery);
  }

  @Override
  public void save(List<UserKpiDto> userKpiDtoList) {
    for (UserKpiDto userKpiDto:userKpiDtoList){
      userKpiDto.setUserId("20220310001");
      userKpiDto.setUserName("小明");
      userKpiDto.setCreatedDate(new Date());
      userKpiDto.setUpdateDate(new Date());
      healthKpiMapper.save(userKpiDto);

    }
  }

  @Override
  public UserKpiDto getResult() {
      String userId = "20220310001";
      //调用存储过程
    healthKpiMapper.execute(userId);
    //查看结果
    UserKpiDto userKpiDto = healthKpiMapper.getResult(userId);
    return  userKpiDto;
  }


}
