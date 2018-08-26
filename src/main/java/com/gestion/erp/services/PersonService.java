package com.gestion.erp.services;

import com.gestion.erp.models.Person.Person;
import com.gestion.erp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PersonService {
    @Autowired PersonRepository personRepository;

    public Person getPersonByFirstName(String firstName){
        return personRepository.findByFirstName(firstName);
    }

    public Person createPerson(Person person){
        return personRepository.save(person);
    }
}
