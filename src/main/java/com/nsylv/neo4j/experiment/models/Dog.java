package com.nsylv.neo4j.experiment.models;

import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@NodeEntity(label = "Dog")
public class Dog extends Animal {
  private List<DogBreed> breeds;

  public Dog(String name, List<DogBreed> breeds) {
    super(name);
    this.breeds = breeds;
  }

  public List<DogBreed> getBreeds() {
    return breeds;
  }

  public void setBreeds(List<DogBreed> breeds) {
    this.breeds = breeds;
  }

  public String toString() {
    return this.getName()
      + ": Breeds<"
      + Optional.ofNullable(this.breeds).orElse(Collections.emptyList())
        .stream().map(DogBreed::toString).collect(Collectors.toList())
      + ">";
  }
}
