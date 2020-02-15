package com.nsylv.neo4j.experiment;

import java.util.Arrays;
import java.util.List;

import com.nsylv.neo4j.experiment.models.Dog;
import com.nsylv.neo4j.experiment.models.DogBreed;
import com.nsylv.neo4j.experiment.models.Person;
import com.nsylv.neo4j.experiment.repositories.DogRepository;
import com.nsylv.neo4j.experiment.repositories.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories
public class Neo4jExperimentApplication {

  private final static Logger log = LoggerFactory.getLogger(Neo4jExperimentApplication.class);

  public static void main(String[] args) throws Exception {
    SpringApplication.run(Neo4jExperimentApplication.class, args);
  }

  @Bean
  CommandLineRunner dogDemo(DogRepository dogRepository) {
    return args -> {
      Dog Berny = new Dog("Berny",Arrays.asList(DogBreed.BORDER_COLLIE));
      Dog Bea = new Dog("Bea", Arrays.asList(DogBreed.BORDER_COLLIE));
      Dog Archie = new Dog("Archie", Arrays.asList(DogBreed.AUSTRALIAN_SHEPARD));

      dogRepository.save(Berny);
      dogRepository.save(Bea);
      dogRepository.save(Archie);

      List<String> names = Arrays.asList("Archie", "Bea", "Berny");
      for (String name : names) {
        log.info("Search [" + name + "]: " + dogRepository.findByName(name).toString());
      }
    };
  }

//  @Bean
//  CommandLineRunner demo(PersonRepository personRepository) {
//    return args -> {
//      personRepository.findByTeammatesName("Roy").stream().forEach(person -> log.info("Found teammate: " + person.getName()));
//    };
//  }

//  @Bean
//  CommandLineRunner demo(PersonRepository personRepository) {
//    return args -> {
//
//      personRepository.deleteAll();
//
//      Person greg = new Person("Greg");
//      Person roy = new Person("Roy");
//      Person craig = new Person("Craig");
//
//      List<Person> team = Arrays.asList(greg, roy, craig);
//
//      log.info("Before linking up with Neo4j...");
//
//      team.stream().forEach(person -> log.info("\t" + person.toString()));
//
//      personRepository.save(greg);
//      personRepository.save(roy);
//      personRepository.save(craig);
//
//      greg = personRepository.findByName(greg.getName());
//      greg.worksWith(roy);
//      greg.worksWith(craig);
//      personRepository.save(greg);
//
//      roy = personRepository.findByName(roy.getName());
//      roy.worksWith(craig);
//      // We already know that roy works with greg
//      personRepository.save(roy);
//
//      // We already know craig works with roy and greg
//
//      log.info("Lookup each person by name...");
//      team.stream().forEach(person -> log.info(
//        "\t" + personRepository.findByName(person.getName()).toString()));
//    };
//  }
}