package com.assignment.eCommerce.Repo;

import com.assignment.eCommerce.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<UserModel,Integer> {
}
