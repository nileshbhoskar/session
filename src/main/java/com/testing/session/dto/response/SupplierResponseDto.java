package com.testing.session.dto.response;

public class SupplierResponseDto {

    private Integer supplierId;

    private String name;

    private String agencyName;

    private String address;

    public SupplierResponseDto() {
    }

    public SupplierResponseDto(Integer supplierId, String name, String agencyName, String address) {
        this.supplierId = supplierId;
        this.name = name;
        this.agencyName = agencyName;
        this.address = address;
    }

    //private List<ProductSupplier> productSupplierList;

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
