package com.papijackson.personapp.services;

import com.papijackson.personapp.dtos.Person;
import org.aspectj.weaver.patterns.PerObject;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    /**
     * Gets person by id.
     * @param id person id
     * @return optional person
     */
     Optional<Person> getPersonById(Integer id);

     List<Person> findAllPersons();

     Optional<Person> savePerson(Person person);
}
