package com.testing.session.service;

import com.testing.session.dto.request.ReceiptRequestDto;

import java.util.List;

public interface ReceiptService {

    void createReceipt(ReceiptRequestDto receiptRequestDto);

    void editReceipt(ReceiptRequestDto receiptRequestDto);

    List getReceipts();
}
