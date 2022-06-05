package com.hello.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户", description = "用户对象User")
public class UserInfo {

    @ApiModelProperty(name = "用户id", value = "用户id")
    private Integer id;

    @ApiModelProperty(name = "用户代码", value = "用户代码")
    private String userCode;

    @ApiModelProperty(name = "用户姓名", value = "用户姓名")
    private String userName;

    @ApiModelProperty(name = "年龄", value = "年龄")
    private Integer age;

}
