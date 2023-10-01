package com.assignment.eCommerce.controller;

import com.assignment.eCommerce.Model.OrderModel;
import com.assignment.eCommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class OrderController {

    @Autowired
    OrderService orderService;
    @PostMapping("order")
    public String placeOrder(@RequestBody OrderModel order){
        return orderService.placeOrder(order);
    }
    @GetMapping("order/id/{orderId}")
    public OrderModel orderById(@PathVariable Integer orderId){
        return orderService.orderById(orderId);
    }
}
