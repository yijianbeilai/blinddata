package com.sz.blinddata.mapper;

import com.sz.blinddata.domain.Hobby;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface HobbyMapper {
    boolean addHobby(Hobby hobby);
    boolean updateHobbyHname(Hobby hobby);
    Hobby selectByHid(Hobby hobby);
    List<Hobby> findAll();
    boolean deleteByHid(Hobby hobby);
    boolean addHobbyList(List<Hobby> list);
}
