package com.testing.session.dto.request;

import com.testing.session.model.ProductSupplier;

import javax.persistence.*;
import java.util.List;

public class UpdateSupplierRequestDto {

    private Integer supplierId;

    private String name;

    private String agencyName;

    private String address;

    /*private List<ProductSupplier> productSupplierList;*/

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /*public List<ProductSupplier> getProductSupplierList() {
        return productSupplierList;
    }

    public void setProductSupplierList(List<ProductSupplier> productSupplierList) {
        this.productSupplierList = productSupplierList;
    }*/
}
