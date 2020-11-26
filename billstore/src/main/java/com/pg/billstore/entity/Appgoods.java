package com.pg.billstore.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class Appgoods {

    private String goodId;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "商品类型")
    private String fagid;

    @ApiModelProperty(value = "商品大类")
    private String isFamily;

    @ApiModelProperty(value = "是否销售")
    private Integer isSelling;

    @ApiModelProperty(value = "排序")
    private Integer orderId;

    private Date createTime;

    private Date updateTime;

    private Integer PageSize;

    private Integer PageNum;

}