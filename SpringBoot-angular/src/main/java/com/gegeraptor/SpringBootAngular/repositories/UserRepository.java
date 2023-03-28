package com.gegeraptor.SpringBootAngular.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gegeraptor.SpringBootAngular.entities.Users;


@Repository
public interface UserRepository extends CrudRepository<Users, Long> {

}
