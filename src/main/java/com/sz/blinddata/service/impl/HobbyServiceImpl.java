package com.sz.blinddata.service.impl;

import com.sz.blinddata.domain.Hobby;
import com.sz.blinddata.mapper.HobbyMapper;
import com.sz.blinddata.service.HobbyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HobbyServiceImpl implements HobbyService {
    @Resource
    private HobbyMapper hobbyMapper;
    @Override
    public boolean addHobby(Hobby hobby) {
        return hobbyMapper.addHobby(hobby);
    }

    @Override
    public boolean updateHobbyHname(Hobby hobby) {
        return hobbyMapper.updateHobbyHname(hobby);
    }

    @Override
    public Hobby selectByHid(Hobby hobby) {
        return hobbyMapper.selectByHid(hobby);
    }

    @Override
    public List<Hobby> findAll() {
        return hobbyMapper.findAll();
    }

    @Override
    public boolean deleteByHid(Hobby hobby) {
        return hobbyMapper.deleteByHid(hobby);
    }

    @Override
    public boolean addHobbyList(List<Hobby> list) {
        return hobbyMapper.addHobbyList(list);
    }
}
