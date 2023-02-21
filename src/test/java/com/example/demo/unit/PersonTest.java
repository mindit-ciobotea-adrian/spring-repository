//package com.example.demo.unit;
//
//import com.example.demo.entity.Person;
//import com.example.demo.service.PersonService;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//@SpringBootTest
//public class PersonTest {
//
//    private PersonService personService;
//
//    @Test
//    public void insertPersonsTest() {
//        Person tony = Person.builder().id(1L).name("Tony").phoneNumber("123").build();
//        Person maria = Person.builder().id(2L).name("Maria").phoneNumber("1234").build();
//        personService.save(tony);
//        personService.save(maria);
//    }
//
//    @Test
//    public void findAllPersonsTest() {
//        List<Person> persons = personService.findAll();
//        Assertions.assertThat(persons).size().isEqualTo(2);
//    }
//
//    @Test
//    public void findPersonByIdTest() {
//        List<Person> persons1 = personService.findById(1L);
//        Assertions.assertThat(persons1).size().isEqualTo(1);
//
//        List<Person> persons2 = personService.findById(2L);
//        Assertions.assertThat(persons2).size().isEqualTo(1);
//    }
//
//    @Test
//    public void deletePersonTest() {
//        List<Person> personList = personService.findAll();
//        Assertions.assertThat(personList).size().isEqualTo(2);
//
//        personService.delete(1L);
//        personList = personService.findAll();
//        Assertions.assertThat(personList).size().isEqualTo(1);
//
//        personService.delete(2L);
//        personList = personService.findAll();
//        Assertions.assertThat(personList).size().isEqualTo(0);
//    }
//}
