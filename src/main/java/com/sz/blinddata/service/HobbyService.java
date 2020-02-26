package com.sz.blinddata.service;

import com.sz.blinddata.domain.Hobby;

import java.util.List;

public interface HobbyService {
    boolean addHobby(Hobby hobby);
    boolean updateHobbyHname(Hobby hobby);
    Hobby selectByHid(Hobby hobby);
    List<Hobby> findAll();
    boolean deleteByHid(Hobby hobby);
    boolean addHobbyList(List<Hobby> list);
}
