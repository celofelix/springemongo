package com.educandoweb.springemongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.springemongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
