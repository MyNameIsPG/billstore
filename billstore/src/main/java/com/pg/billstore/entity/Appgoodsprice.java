package com.pg.billstore.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class Appgoodsprice {

    @ApiModelProperty(value = "商品价格id")
    private String goodspriceId;

    @ApiModelProperty(value = "商品id")
    private String goodId;

    @ApiModelProperty(value = "商品名称")
    private String name;

    private String price;

    @ApiModelProperty(value = "是否销售")
    private Integer isSelling;

    @ApiModelProperty(value = "更新人id")
    private String updateUserId;

    @ApiModelProperty(value = "更新人名称")
    private String updateUserName;

    private Date createTime;

    private Date updateTime;

    private Integer PageSize;

    private Integer PageNum;

}