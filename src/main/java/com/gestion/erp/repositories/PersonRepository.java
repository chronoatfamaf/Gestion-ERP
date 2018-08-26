package com.gestion.erp.repositories;

import com.gestion.erp.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, String> {
    Person findByFirstName(String firstName);
    Person findById(Integer id);
}
