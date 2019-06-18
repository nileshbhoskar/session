package com.testing.session.dto.request;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class UserLoginRequestDto {

    @NotNull(message = "Login Id is mandatory")
    @NotBlank(message = "Login Id is mandatory")
    private String loginId;

    @NotNull(message = "Password is mandatory")
    @NotBlank(message = "Password Id is mandatory")
    private String password;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
