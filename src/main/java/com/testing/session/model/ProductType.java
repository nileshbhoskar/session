package com.testing.session.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product_type")
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_type_id")
    private Integer productTypeId;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "productType")
    private List<Product> product;

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

}
