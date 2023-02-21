package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonService {
    Logger log = Logger.getAnonymousLogger();

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findAll() {
        try {
            return personRepository.findAll();
        } catch (Exception e) {
            log.severe(e.getMessage());
            return null;
        }
    }

    public List<Person> findById(Long id) {
        try {
            return personRepository.findAllById(id);
        } catch (Exception e) {
            log.severe(e.getMessage());
            return null;
        }
    }

    public void delete(Long id) {
        try {
            personRepository.delete(id);
        } catch (Exception e) {
            log.severe(e.getMessage());
        }
    }

    public void save(Person person) {
        try {
            personRepository.save(person);
        } catch (Exception e) {
            log.severe(e.getMessage());
        }
    }

}
