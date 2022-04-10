package com.example.voaserver.pojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author Brilley
 * @description voa-server
 * @date 2022-04-10 18:20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Api(value="AdminLoginParam对象")
public class AdminLoginParam {

    @ApiModelProperty(value ="用户名", required = true)
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    private String password;
}
