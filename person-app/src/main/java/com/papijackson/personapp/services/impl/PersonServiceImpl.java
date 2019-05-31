package com.papijackson.personapp.services.impl;

import com.papijackson.personapp.dtos.Person;
import com.papijackson.personapp.mappers.PersonMapper;
import com.papijackson.personapp.repositories.PersonRepository;
import com.papijackson.personapp.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Optional<Person> getPersonById(Integer id) {
        return personRepository.findById(id).map(personEntity -> PersonMapper.entityToPerson.apply(personEntity));
    }

    @Override
    public List<Person> findAllPersons() {
        return personRepository.findAll().parallelStream()
                .map(personEntity -> PersonMapper.entityToPerson.apply(personEntity))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Person> savePerson(Person person) {
        return Optional.of(
                PersonMapper.entityToPerson.apply(personRepository.save(PersonMapper.personToEntity.apply(person))));

    }
}
