package com.testing.session.dao;

import com.testing.session.dto.response.SupplierResponseDto;
import com.testing.session.model.Supplier;

import java.util.List;

public interface SupplierDao {

    void createSupplier(Supplier supplier);

    void editSupplier(Supplier supplier);

    List getSuppliers();

    SupplierResponseDto getSupplierById(Integer supplierId);
}
