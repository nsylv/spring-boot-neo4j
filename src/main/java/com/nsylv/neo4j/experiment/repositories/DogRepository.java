package com.nsylv.neo4j.experiment.repositories;

import com.nsylv.neo4j.experiment.models.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
  Dog findByName(String name);
}
