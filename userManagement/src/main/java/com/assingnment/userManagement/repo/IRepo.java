package com.assingnment.userManagement.repo;

import com.assingnment.userManagement.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface IRepo extends CrudRepository<User, Integer> {

}
