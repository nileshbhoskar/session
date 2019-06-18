package com.testing.session.dao.impl;

import com.testing.session.dao.SupplierDao;
import com.testing.session.dto.response.SupplierResponseDto;
import com.testing.session.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository(value = "SupplierDao")
@Transactional
public class SupplierDaoImpl implements SupplierDao {

    @Autowired
    private EntityManager mEntityManager;


    @Override
    public void createSupplier(Supplier supplier) {
        mEntityManager.persist(supplier);
    }

    @Override
    public void editSupplier(Supplier supplier) {
        mEntityManager.merge(supplier);

    }

    @Override
    public List getSuppliers() {
        Query query = mEntityManager.createQuery("Select s from Supplier as s");
        List list = query.getResultList();
        return list;
    }

    @Override
    public SupplierResponseDto getSupplierById(Integer supplierId) {
        Query query = mEntityManager.createQuery("Select New com.testing.session.dto.response.SupplierResponseDto(s.supplierId as supplierId, s.name as name, s.agencyName as agencyName, s.address as address) from Supplier as s where s.supplierId=:supplierId");
        query.setParameter("supplierId", supplierId);
        SupplierResponseDto supplier = (SupplierResponseDto)query.getSingleResult();
        return supplier;
    }
}
