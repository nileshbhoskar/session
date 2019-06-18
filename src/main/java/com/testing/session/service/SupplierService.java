package com.testing.session.service;

import com.testing.session.dto.request.CreateSupplierRequestDto;
import com.testing.session.dto.request.UpdateSupplierRequestDto;
import com.testing.session.dto.response.SupplierResponseDto;

import java.util.List;

public interface SupplierService {

    void createSupplier(CreateSupplierRequestDto supplier);

    void editSupplier(UpdateSupplierRequestDto supplier);

    List getSuppliers();

    SupplierResponseDto getSupplierById(Integer supplierId);
}
