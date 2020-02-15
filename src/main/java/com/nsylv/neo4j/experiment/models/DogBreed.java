package com.nsylv.neo4j.experiment.models;

public enum DogBreed {
  AUSTRALIAN_SHEPARD ("Australian Shepard"),
  BORDER_COLLIE ("Border Collie");

  private final String displayName;
  DogBreed(String displayName) {
    this.displayName = displayName;
  }
  public String toString() {
    return this.displayName;
  }
}
