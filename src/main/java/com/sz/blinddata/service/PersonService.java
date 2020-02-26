package com.sz.blinddata.service;

import com.sz.blinddata.domain.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();
    Person selectByAccount(Person person);
    boolean deleteByAccount(Person person);
    boolean addPerson(Person person);
    boolean updatePnickname(Person person);
    boolean updatePicon(Person person);
    Person login(Person person);
    boolean signup(Person person);
}
