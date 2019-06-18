package com.testing.session.dto.request;

public class StudentRequestDto {

    private Integer studentId;

    private String fullName;

    private String address;

    public StudentRequestDto() {}

    public StudentRequestDto(Integer studentId, String fullName, String address) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.address = address;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
