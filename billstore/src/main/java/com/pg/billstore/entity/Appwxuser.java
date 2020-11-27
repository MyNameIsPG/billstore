package com.pg.billstore.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class Appwxuser {

    private String wxId;

    @ApiModelProperty(value = "微信小程序id")
    private String openId;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "性别")
    private Integer gender;

    @ApiModelProperty(value = "头像")
    private String avatarUrl;

    @ApiModelProperty(value = "手机号码")
    private String mobile;

    @ApiModelProperty(value = "1管理员 2员工 3供应商 3客户")
    private Integer role;

    private Date createTime;

    private Date updateTime;

}