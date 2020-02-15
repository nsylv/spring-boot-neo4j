package com.nsylv.neo4j.experiment.repositories;

import com.nsylv.neo4j.experiment.models.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
  Animal findByName(String name);
}
