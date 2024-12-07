package com.example.homework5_new.repository;

import com.example.homework5_new.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
