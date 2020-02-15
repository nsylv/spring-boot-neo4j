package com.nsylv.neo4j.experiment.models;

import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@NodeEntity(label = "Cat")
public class Cat extends Animal {
  private List<CatBreed> breeds;

  public Cat(String name, List<CatBreed> breeds) {
    super(name);
    this.breeds = breeds;
  }

  public List<CatBreed> getBreeds() {
    return breeds;
  }

  public void setBreeds(List<CatBreed> breeds) {
    this.breeds = breeds;
  }

  public String toString() {
    return this.getName()
      + ": Breeds<"
      + Optional.ofNullable(this.breeds).orElse(Collections.emptyList())
        .stream().map(CatBreed::toString).collect(Collectors.toList())
      + ">";
  }
}
