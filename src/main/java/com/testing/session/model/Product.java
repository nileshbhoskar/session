package com.testing.session.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name")
    private String productName;

    @OneToMany(mappedBy = "product")
    private List<ProductSupplier> productSupplierList;

    /*@OneToMany(mappedBy = "product")
    private List<ProductType> productTypeList;*/

    @ManyToOne
    @JoinColumn(name = "product_type_id")
    private ProductType productType;

    @OneToOne(mappedBy = "product")
    private StockMaster stockMaster;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<ProductSupplier> getProductSupplierList() {
        return productSupplierList;
    }

    public void setProductSupplierList(List<ProductSupplier> productSupplierList) {
        this.productSupplierList = productSupplierList;
    }

    /*public List<ProductType> getProductTypeList() {
        return productTypeList;
    }

    public void setProductTypeList(List<ProductType> productTypeList) {
        this.productTypeList = productTypeList;
    }*/

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public StockMaster getStockMaster() {
        return stockMaster;
    }

    public void setStockMaster(StockMaster stockMaster) {
        this.stockMaster = stockMaster;
    }

}
