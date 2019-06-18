package com.testing.session.dao;

import com.testing.session.model.Receipt;

import java.util.List;

public interface ReceiptDao {

    void addReceipt(Receipt receipt);

    void updateReceipt(Receipt receipt);

    List getAllReceipt();
}
