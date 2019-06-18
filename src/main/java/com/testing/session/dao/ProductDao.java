package com.testing.session.dao;

import com.testing.session.model.Product;
import com.testing.session.model.ProductType;

import java.util.List;

public interface ProductDao {

    List getProducts();

    Product getProductById(Integer productId);

    List getProductByType(String type);

    ProductType getProductTypeById(Integer productTypeId);

}
