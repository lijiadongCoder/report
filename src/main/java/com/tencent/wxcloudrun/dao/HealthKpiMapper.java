package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.HealthKpiDto;
import com.tencent.wxcloudrun.model.UserKpiDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface HealthKpiMapper {


  List<HealthKpiDto> getAll(HealthKpiDto healthKpiDto);

  void save(UserKpiDto userKpiDto);

  void execute(String userId);

  UserKpiDto getResult(String userId);
}
