package com.gestion.erp.repositories;

import com.gestion.erp.models.Person.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, String> {
    Person findByFirstName(String firstName);
    Person findPersonByEmailAddress(String emailAddress);
    Person findById(Integer id);
}
