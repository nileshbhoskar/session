package com.testing.session.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "receipt")
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "receipt_id")
    private Integer receiptId;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "receipt_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receiptDate;

    @Column(name = "purpose")
    private String purpose;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
