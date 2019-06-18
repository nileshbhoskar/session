package com.testing.session.dto.response;

import java.util.List;

public class ProductTypeResponseDto {

    private Integer productTypeId;

    private String name;

    private List<ProductStockResponseDto> productResponseDtoList;

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

    public List<ProductStockResponseDto> getProductResponseDtoList() {
        return productResponseDtoList;
    }

    public void setProductResponseDtoList(List<ProductStockResponseDto> productResponseDtoList) {
        this.productResponseDtoList = productResponseDtoList;
    }
}
