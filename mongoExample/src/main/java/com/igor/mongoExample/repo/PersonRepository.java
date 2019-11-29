package com.igor.mongoExample.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.igor.mongoExample.models.Person;

public interface PersonRepository extends MongoRepository<Person, Long> {

}
