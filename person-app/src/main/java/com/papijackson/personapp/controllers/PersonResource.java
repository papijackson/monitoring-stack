package com.papijackson.personapp.controllers;

import com.papijackson.personapp.dtos.Person;
import com.papijackson.personapp.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonResource {

    @Autowired
    private PersonService personService;


    /**
     * Get person by id
     *
     * @param personId person id
     * @return Person that matches he given id
     */
    @GetMapping(value = "/{personId}")
    public ResponseEntity getPersonById(@PathVariable("personId") Integer personId) {
        return personService.getPersonById(personId).map(person -> ResponseEntity.ok(person))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


    @PostMapping
    public ResponseEntity<Person> savePerson(@RequestBody Person person) {
        return personService.savePerson(person).map(savedPerson ->
                ResponseEntity.ok(savedPerson)
        ).orElseGet(() ->
                ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).build()
        );
    }

}
