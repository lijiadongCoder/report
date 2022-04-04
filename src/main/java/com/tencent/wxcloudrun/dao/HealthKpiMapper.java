package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.HealthKpiDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HealthKpiMapper {


  List<HealthKpiDto> getAll();
}
