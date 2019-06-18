package com.testing.session.dto.response;

public class ProductResponseDto {

    private Integer ProductId;

    private String productName;

    private String productType;

    public ProductResponseDto() {
    }

    public ProductResponseDto(Integer productId, String productName, String productType) {
        this.ProductId = productId;
        this.productName = productName;
        this.productType = productType;
    }

    public Integer getProductId() {
        return ProductId;
    }

    public void setProductId(Integer productId) {
        this.ProductId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
