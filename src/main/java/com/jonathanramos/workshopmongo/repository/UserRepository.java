package com.jonathanramos.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jonathanramos.workshopmongo.enetity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
