package com.assignment.eCommerce.controller;

import com.assignment.eCommerce.Model.ProductModel;
import com.assignment.eCommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class ProductController {

    @Autowired
    ProductService productService;
    @PostMapping("product")
    public String addProductd(@RequestBody ProductModel product){
        return productService.addProduct(product);
    }
    @GetMapping("products")
    public List<ProductModel> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("products/category")
    public List<ProductModel> getAllProductsByCategory(@RequestParam String category){
        return productService.getAllProductsByCategory(category);
    }
    @DeleteMapping("product/id/{productId}")
    public String deleteProduct(@PathVariable Integer productId){
        return productService.deleteProduct(productId);
    }
}
