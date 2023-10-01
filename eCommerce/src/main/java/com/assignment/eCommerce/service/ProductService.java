package com.assignment.eCommerce.service;

import com.assignment.eCommerce.Model.ProductModel;
import com.assignment.eCommerce.Repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductRepo productRepo;
    public String addProduct(ProductModel product) {
        productRepo.save(product);
        return "product added";
    }

    public List<ProductModel> getAllProducts() {
        return productRepo.findAll();
    }

    public List<ProductModel> getAllProductsByCategory(String category) {
        return productRepo.findByCategory(category);
    }

    public String deleteProduct(Integer productId) {
        productRepo.deleteById(productId);
        return "Deleted ";
    }
}
