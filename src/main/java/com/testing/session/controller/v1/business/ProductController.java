package com.testing.session.controller.v1.business;

import com.testing.session.dto.response.ProductResponseDto;
import com.testing.session.dto.response.ProductTypeResponseDto;
import com.testing.session.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class ProductController {

    @Autowired
    private ProductService mProductService;

    @GetMapping(value = "/v1/product")
    public ResponseEntity getProductList() {

        List list = mProductService.getProducts();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping(value = "/v1/product/{productId}")
    public ResponseEntity getProductById(@PathVariable(value = "productId") Integer productId) {
        ProductResponseDto dto = mProductService.getProductById(productId);

        return new ResponseEntity(dto, HttpStatus.OK);
    }

    @GetMapping(value = "/v1/productByTypeId/{productTypeId}")
    public ResponseEntity getProductsByTypeId(@PathVariable(value = "productTypeId") Integer typeName) {
        ProductTypeResponseDto dto = mProductService.getProductTypeById(typeName);

        return new ResponseEntity(dto, HttpStatus.OK);
    }
    @GetMapping(value = "/v1/product/productType")
    public ResponseEntity getProductsByTypeId(@RequestParam String typeName) {
        List  dto = mProductService.getProductByType(typeName);
        System.out.println(dto);

        return new ResponseEntity(dto, HttpStatus.OK);
    }
}
