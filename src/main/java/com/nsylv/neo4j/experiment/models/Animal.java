package com.nsylv.neo4j.experiment.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Animal {
  @Id @GeneratedValue private Long id;

  private String name;

  // empty constructor required as of Neo4j API 2.0.5?
  public Animal() {};

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
