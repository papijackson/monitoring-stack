package com.papijackson.personapp.mappers;

import com.papijackson.personapp.dtos.Person;
import com.papijackson.personapp.entities.PersonEntity;

import java.util.function.Function;

public class PersonMapper {
    public static final Function<PersonEntity, Person> entityToPerson =
            (personEntity -> Person.builder()
                    .age(personEntity.getAge())
                    .email(personEntity.getEmail())
                    .firstName(personEntity.getFirstName())
                    .lastName(personEntity.getLastName())
                    .personId(personEntity.getPersonId())
                    .build());


    public static final Function<Person, PersonEntity> personToEntity =
            (person -> PersonEntity.builder()
                    .age(person.getAge())
                    .email(person.getEmail())
                    .firstName(person.getFirstName())
                    .lastName(person.getLastName())
                    .personId(person.getPersonId())
                    .build());
}
