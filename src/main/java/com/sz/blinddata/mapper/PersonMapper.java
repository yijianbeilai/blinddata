package com.sz.blinddata.mapper;

import com.sz.blinddata.domain.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("personMapper")
public interface PersonMapper {
    List<Person> findAll();
    Person selectByAccount(Person person);
    boolean deleteByAccount(Person person);
    boolean addPerson(Person person);
    boolean updatePnickname(Person person);
    boolean updatePicon(Person person);
    Person login(Person person);
}
