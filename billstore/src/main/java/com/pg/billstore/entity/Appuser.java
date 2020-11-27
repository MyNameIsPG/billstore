package com.pg.billstore.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class Appuser {

    private String userId;

    @ApiModelProperty(value = "真实姓名")
    private String truename;

    @ApiModelProperty(value = "手机号码")
    private String phone;

    @ApiModelProperty(value = "身份证号码")
    private String idCard;

    @ApiModelProperty(value = "是否管理员")
    private Integer isAdmin;

    @ApiModelProperty(value = "微信openid")
    private String openId;

    private Date createTime;

    private Date updateTime;

    private Integer PageSize;

    private Integer PageNum;

}