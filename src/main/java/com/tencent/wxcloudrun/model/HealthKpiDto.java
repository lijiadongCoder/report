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

    private String userId;
    private String userName;
    private String telephoneNumber;
    private Date birthday;
    private Date currentDate;
    private Integer childMonths;
    private Integer monthAge;
    private Integer seqNum;
    private String kpiType;
    private String kpiDesc;
    private String kpiCode;
    private BigDecimal score;
    private Integer pageCount;

}
