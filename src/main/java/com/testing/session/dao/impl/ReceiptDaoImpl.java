package com.testing.session.dao.impl;

import com.testing.session.dao.ReceiptDao;
import com.testing.session.model.Receipt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository(value = "ReceiptDao")
public class ReceiptDaoImpl implements ReceiptDao {

    @Autowired
    private EntityManager mEntityManager;

    @Override
    public void addReceipt(Receipt receipt) {
        mEntityManager.persist(receipt);
    }

    @Override
    public void updateReceipt(Receipt receipt) {
        mEntityManager.merge(receipt);
    }

    @Override
    public List getAllReceipt() {
        Query query = mEntityManager.createQuery("Select NEW com.testing.session.dto.response.ReceiptResponseDto(r.receiptId as receiptId, r.amount as amount, r.receiptDate as receiptDate, r.purpose as purpose, r.student.fullName as studentName) from receipt as r");
        List list = query.getResultList();
        return list;
    }
}
