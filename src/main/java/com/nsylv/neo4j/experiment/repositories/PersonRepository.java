package com.nsylv.neo4j.experiment.repositories;

import com.nsylv.neo4j.experiment.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
  Person findByName(String name);
}
