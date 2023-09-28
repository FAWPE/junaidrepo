package com.assingnment.userManagement.repo;

import com.assingnment.userManagement.Model.Userent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepo extends CrudRepository<Userent, Integer> {

}
