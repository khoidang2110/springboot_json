package com.cybersoft.demoapi08.controller;


import com.cybersoft.demoapi08.entity.CategoryEntity;
import com.cybersoft.demoapi08.entity.ProductDetailEntity;
import com.cybersoft.demoapi08.entity.ProductEntity;
import com.cybersoft.demoapi08.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @Autowired
    private List<ProductEntity> productList; // Inject danh sách product

    @Autowired
    private Map<Integer, String> categoryMap; // Inject danh mục

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/{categoryId}")
    public Map<String, Object> getProductsByCategory(@PathVariable int categoryId) {
        List<ProductEntity> filteredProducts = productList.stream()
                .filter(product -> product.getCategoryId() == categoryId) // So sánh int trực tiếp
                .collect(Collectors.toList());

        if (filteredProducts.isEmpty() || !categoryMap.containsKey(categoryId)) {
            return Map.of("message", "Không tìm thấy danh mục!");
        }

        return Map.of(
                "category", Map.of(
                        "category_id", categoryId,
                        "category_name", categoryMap.get(categoryId)
                ),
                "product_list", filteredProducts
        );
    }
    @GetMapping("/detail/{productId}")
    public ProductDetailEntity getProductDetail(@PathVariable int productId) {
        return productService.getProductById(productId);
    }

}
