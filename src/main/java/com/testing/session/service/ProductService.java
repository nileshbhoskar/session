package com.testing.session.service;

import com.testing.session.dto.response.ProductResponseDto;
import com.testing.session.dto.response.ProductTypeResponseDto;

import java.util.List;

public interface ProductService {

    List getProducts();

    ProductResponseDto getProductById(Integer productId);

    List getProductByType(String productType);

    ProductTypeResponseDto getProductTypeById(Integer productTypeId);
}
