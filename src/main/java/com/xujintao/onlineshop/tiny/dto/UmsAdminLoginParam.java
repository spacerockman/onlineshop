package com.xujintao.onlineshop.tiny.dto;

import io.swagger.annotations.ApiModelProperty;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.NotEmpty;

/**
 * @Author Jintao Xu
 * @Description:
 * @Date 2021/06/23 16:28
 * @Version:1.0
 */
public class UmsAdminLoginParam {
    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
