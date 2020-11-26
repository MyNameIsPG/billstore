package com.pg.billstore.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class Apppyway {

    private String pywayId;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "是否支付")
    private Integer isFinshed;

    @ApiModelProperty(value = "排序")
    private Integer orderId;

    private Date createTime;

    private Date updateTime;

    private Integer PageSize;

    private Integer PageNum;

}