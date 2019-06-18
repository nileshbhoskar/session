package com.testing.session.dao.impl;

import com.testing.session.dao.ProductDao;
import com.testing.session.model.Product;
import com.testing.session.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository(value = "ProductDao")
@Transactional
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private EntityManager mEntityManager;


    @Override
    public List getProducts() {
        Query query = mEntityManager.createQuery("Select NEW com.testing.session.dto.response.ProductResponseDto(p.productId as productId, p.productName as productName, p.productType.name as productType) from Product as p");
        List list = query.getResultList();
        return list;
    }

    @Override
    public Product getProductById(Integer productId) {
        //Query query = mEntityManager.createQuery("Select NEW com.testing.session.dto.response.ProductResponseDto(p.productId as productId, p.productName as productName, p.productType.name as productType) from Product as p where p.productId=:productId");
        Query query = mEntityManager.createQuery("Select p from Product as p where p.productId=:productId");
        query.setParameter("productId", productId);
        Product product = (Product) query.getSingleResult();
        return product;
    }

    @Override
    public List getProductByType(String type) {
        //Query query = mEntityManager.createQuery("Select NEW com.testing.session.dto.response.ProductResponseDto(p.productId as productId, p.productName as productName, p.productType.name as productType) from Product as p inner join p.productType where p.productType.name=:type");
        Query query = mEntityManager.createQuery("Select NEW com.testing.session.dto.response.ProductResponseDto(p.productId as ProductId, p.productName as productName, p.productType.name as productType) from ProductType as pt left join pt.product as p where p.productType.name=:type");
        //Query query = mEntityManager.createQuery("Select p from Product as p where p.productType.name=:type");
        query.setParameter("type", type);
        List list = query.getResultList();
        return list;
    }

    @Override
    public ProductType getProductTypeById(Integer productTypeId) {
        Query query = mEntityManager.createQuery("Select p from ProductType as p where p.productTypeId=:type");
        query.setParameter("type", productTypeId);
        ProductType dto = (ProductType) query.getSingleResult();
        return dto;
    }


}
