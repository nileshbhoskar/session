package com.testing.session.dto.response;

public class UserResponseDto {

    private Integer userId;

    private String fullName;

    private String emailId;

    private String loginId;

    private String password;

    private String userType;

    private String shortName;

    public UserResponseDto(Integer userId, String fullName, String emailId, String loginId, String password, String userType, String shortName) {
        this.userId = userId;
        this.fullName = fullName;
        this.emailId = emailId;
        this.loginId = loginId;
        this.password = password;
        this.userType = userType;
        this.shortName = shortName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", fullName='" + fullName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", loginId='" + loginId + '\'' +
                ", password='" + password + '\'' +
                ", userType='" + userType + '\'' +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}
