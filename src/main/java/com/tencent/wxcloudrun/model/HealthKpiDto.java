package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: springboot-wxcloudrun
 * @description: HealthKpi
 * @author: ljd
 * @create: 2022/04/04
 */
@Data
public class HealthKpiDto implements Serializable {

    private Integer monthAge;
    private String monthAgeDesc;
    private String kpiType;
    private String kpiCode;
    private String kpiDesc;
    private BigDecimal score;
    private Date createdTime;


}
