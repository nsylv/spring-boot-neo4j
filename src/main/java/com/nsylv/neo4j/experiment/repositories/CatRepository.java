package com.nsylv.neo4j.experiment.repositories;

import com.nsylv.neo4j.experiment.models.Cat;
import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cat, Long> {
  Cat findByName(String name);
}
