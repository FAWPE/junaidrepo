package com.assignment.eCommerce.Repo;

import com.assignment.eCommerce.Model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<OrderModel,Integer> {
}
