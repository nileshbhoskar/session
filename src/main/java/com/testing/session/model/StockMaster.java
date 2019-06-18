package com.testing.session.model;

import javax.persistence.*;

@Entity
@Table(name = "stock_master")
public class StockMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stock_master_id")
    private Integer stockMasterId;

    @Column(name = "quantity")
    private Integer quantity;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Integer getStockMasterId() {
        return stockMasterId;
    }

    public void setStockMasterId(Integer stockMasterId) {
        this.stockMasterId = stockMasterId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
