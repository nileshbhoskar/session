package com.testing.session.dto.response;

import java.util.Date;

public class ReceiptResponseDto {

    private Integer receiptId;

    private Double amount;

    private Date receiptDate;

    private String purpose;

    private String studentName;

    public ReceiptResponseDto(Integer receiptId, Double amount, Date receiptDate, String purpose, String studentName) {
        this.receiptId = receiptId;
        this.amount = amount;
        this.receiptDate = receiptDate;
        this.purpose = purpose;
        this.studentName = studentName;
    }

    public Integer getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
