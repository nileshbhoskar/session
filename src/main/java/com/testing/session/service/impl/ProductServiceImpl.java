package com.testing.session.service.impl;

import com.testing.session.dao.ProductDao;
import com.testing.session.dto.response.ProductResponseDto;
import com.testing.session.dto.response.ProductStockResponseDto;
import com.testing.session.dto.response.ProductTypeResponseDto;
import com.testing.session.dto.response.StockMasterResponseDto;
import com.testing.session.model.Product;
import com.testing.session.model.ProductType;
import com.testing.session.model.StockMaster;
import com.testing.session.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "ProductService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao mProductDao;

    @Override
    public List getProducts() {
        return mProductDao.getProducts();
    }

    @Override
    public ProductResponseDto getProductById(Integer productId) {
        Product product = mProductDao.getProductById(productId);
        ProductResponseDto dto = new ProductResponseDto();
        dto.setProductId(product.getProductId());
        dto.setProductName(product.getProductName());
        dto.setProductType(product.getProductType().getName());
        return dto;
    }

    @Override
    public List getProductByType(String productType) {
        /*List<Product> list = mProductDao.getProductByType(productType);
        List<ProductResponseDto> dtoList = new ArrayList<>();
        ProductResponseDto dto;
        for (Product product : list) {
            //Product product = mProductDao.getProductById(productId);
            dto = new ProductResponseDto();
            dto.setProductId(product.getProductId());
            dto.setProductName(product.getProductName());
            dto.setProductType(product.getProductType().getName());
            dtoList.add(dto);
        }*/
        return mProductDao.getProductByType(productType);
        //return dtoList;
    }

    @Override
    public ProductTypeResponseDto getProductTypeById(Integer productTypeId) {
        ProductType productType = mProductDao.getProductTypeById(productTypeId);
        ProductTypeResponseDto dto = new ProductTypeResponseDto();
        System.out.println("object mapping started");
        dto.setProductTypeId(productType.getProductTypeId());
        dto.setName(productType.getName());

        List<Product> list = productType.getProduct();
        List<ProductStockResponseDto> productStockList = new ArrayList<>();

        StockMaster stockMaster;
        ProductStockResponseDto psDto;
        StockMasterResponseDto smDto;

        for (Product product : list){
            psDto = new ProductStockResponseDto();
            psDto.setProductId(product.getProductId());
            psDto.setProductName(product.getProductName());

            stockMaster = product.getStockMaster();
            smDto = new StockMasterResponseDto();
            smDto.setStockMasterId(stockMaster.getStockMasterId());
            smDto.setQuantity(stockMaster.getQuantity());

            psDto.setResponseDto(smDto);

            productStockList.add(psDto);
        }
        dto.setProductResponseDtoList(productStockList);
        System.out.println("object mapping ended");
        return dto;
    }
}
