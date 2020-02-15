package com.nsylv.neo4j.experiment.repositories;

import com.nsylv.neo4j.experiment.models.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long> {
  Person findByName(String name);

  List<Person> findByTeammatesName(String name);
}
