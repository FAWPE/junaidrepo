package com.assignment.eCommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    @ManyToMany
    @JoinTable(name = "Orders_users", joinColumns = @JoinColumn(name = "orders"),inverseJoinColumns = @JoinColumn(name = "users"))
    List<UserModel>  user;
    @ManyToMany
    @JoinTable(name = "order_product", joinColumns = @JoinColumn(name = "orders"), inverseJoinColumns = @JoinColumn(name = "product "))
  List<ProductModel> productID;
    @ManyToOne
    @JoinColumn(name = "fkAddress")
   AddressModel  addressID;
   private Integer  productQuantity;

}
