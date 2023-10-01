package com.assignment.eCommerce.Repo;

import com.assignment.eCommerce.Model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepo extends JpaRepository<ProductModel,Integer> {
    List<ProductModel> findByCategory(String category);
}
