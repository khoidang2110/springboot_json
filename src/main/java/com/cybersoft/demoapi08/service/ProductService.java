package com.cybersoft.demoapi08.service;

import com.cybersoft.demoapi08.entity.ProductDetailEntity;
import com.cybersoft.demoapi08.entity.ProductEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductDetailEntity productDetail;

    public ProductService(ProductDetailEntity productDetail) {
        this.productDetail = productDetail;
    }

    public ProductDetailEntity getProductById(int productId) {
        return productDetail;
    }
}
