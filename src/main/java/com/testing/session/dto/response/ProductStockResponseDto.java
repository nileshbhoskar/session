package com.testing.session.dto.response;

public class ProductStockResponseDto {

    private Integer productId;

    private String productName;

    private StockMasterResponseDto responseDto;

    public ProductStockResponseDto() {
    }

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

    public StockMasterResponseDto getResponseDto() {
        return responseDto;
    }

    public void setResponseDto(StockMasterResponseDto responseDto) {
        this.responseDto = responseDto;
    }
}
