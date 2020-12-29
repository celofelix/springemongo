package com.educandoweb.springemongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.springemongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
