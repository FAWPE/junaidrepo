package com.assignment.eCommerce.service;

import com.assignment.eCommerce.Model.OrderModel;
import com.assignment.eCommerce.Repo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    IOrderRepo orderRepo;
    public String placeOrder(OrderModel order) {
        orderRepo.save(order);
        return "order placed";
    }

    public OrderModel orderById(Integer orderId) {
        return orderRepo.findById(orderId).orElse(new OrderModel());
    }
}
