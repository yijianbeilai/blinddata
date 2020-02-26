package com.sz.blinddata.service.impl;

import com.sz.blinddata.domain.Person;
import com.sz.blinddata.mapper.PersonMapper;
import com.sz.blinddata.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Resource
    private PersonMapper personMapper;
    @Override
    public List<Person> findAll() {
        return personMapper.findAll();
    }

    @Override
    public Person selectByAccount(Person person) {
        return personMapper.selectByAccount(person);
    }

    @Override
    public boolean deleteByAccount(Person person) {
        return personMapper.deleteByAccount(person);
    }

    @Override
    public boolean addPerson(Person person) {
        return personMapper.addPerson(person);
    }

    @Override
    public boolean updatePnickname(Person person) {
        return personMapper.updatePnickname(person);
    }

    @Override
    public boolean updatePicon(Person person) {
        return personMapper.updatePicon(person);
    }

    @Override
    public Person login(Person person) {
        return  personMapper.login(person);
    }

    @Override
    public boolean signup(Person person) {
        Person person1=personMapper.selectByAccount(person);
        if(person1==null){
            personMapper.addPerson(person);
            return true;
        }
        return false;
    }


}
