package com.testing.session.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "supplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "supplier_id")
    private Integer supplierId;

    @Column(name = "name")
    private String name;

    @Column(name = "agency_name")
    private String agencyName;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "supplier")
    private List<ProductSupplier> productSupplierList;

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

    public List<ProductSupplier> getProductSupplierList() {
        return productSupplierList;
    }

    public void setProductSupplierList(List<ProductSupplier> productSupplierList) {
        this.productSupplierList = productSupplierList;
    }
}
