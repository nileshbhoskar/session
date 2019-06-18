package com.testing.session.service.impl;

import com.testing.session.dao.ReceiptDao;
import com.testing.session.dto.request.ReceiptRequestDto;
import com.testing.session.model.Receipt;
import com.testing.session.model.Student;
import com.testing.session.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "ReceiptService")
public class ReceiptServiceImpl implements ReceiptService {

    @Autowired
    private ReceiptDao mReceiptDao;

    @Override
    public void createReceipt(ReceiptRequestDto receiptRequestDto) {
        Receipt receipt = new Receipt();
        receipt.setAmount(receiptRequestDto.getAmount());
        receipt.setPurpose(receiptRequestDto.getPurpose());
        receipt.setReceiptDate(receiptRequestDto.getReceiptDate());

        Student student = new Student();
        student.setStudentId(receiptRequestDto.getStudentId());
        receipt.setStudent(student);

        mReceiptDao.addReceipt(receipt);
    }

    @Override
    public void editReceipt(ReceiptRequestDto receiptRequestDto) {
        Receipt receipt = new Receipt();
        receipt.setReceiptId(receiptRequestDto.getReceiptId());
        receipt.setAmount(receiptRequestDto.getAmount());
        receipt.setPurpose(receiptRequestDto.getPurpose());
        receipt.setReceiptDate(receiptRequestDto.getReceiptDate());

        Student student = new Student();
        student.setStudentId(receiptRequestDto.getStudentId());
        receipt.setStudent(student);

        mReceiptDao.updateReceipt(receipt);
    }

    @Override
    public List getReceipts() {
        return mReceiptDao.getAllReceipt();
    }
}
