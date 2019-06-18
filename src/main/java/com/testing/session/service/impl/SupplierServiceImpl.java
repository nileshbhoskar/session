package com.testing.session.service.impl;

import com.testing.session.dao.SupplierDao;
import com.testing.session.dto.request.CreateSupplierRequestDto;
import com.testing.session.dto.request.UpdateSupplierRequestDto;
import com.testing.session.dto.response.SupplierResponseDto;
import com.testing.session.model.Supplier;
import com.testing.session.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "SupplierService")
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    SupplierDao mSupplierDao;

    @Override
    public void createSupplier(CreateSupplierRequestDto supplier) {
        Supplier supplier1 = new Supplier();
        supplier1.setName(supplier.getName());
        supplier1.setAgencyName(supplier.getAgencyName());
        supplier1.setAddress(supplier.getAddress());

        mSupplierDao.createSupplier(supplier1);
    }

    @Override
    public void editSupplier(UpdateSupplierRequestDto supplier) {
        Supplier supplier1 = new Supplier();
        supplier1.setSupplierId(supplier.getSupplierId());
        supplier1.setName(supplier.getName());
        supplier1.setAgencyName(supplier.getAgencyName());
        supplier1.setAddress(supplier.getAddress());

        mSupplierDao.editSupplier(supplier1);
    }

    @Override
    public List getSuppliers() {
        return mSupplierDao.getSuppliers();
    }

    @Override
    public SupplierResponseDto getSupplierById(Integer supplierId) {
        return mSupplierDao.getSupplierById(supplierId);
    }
}
