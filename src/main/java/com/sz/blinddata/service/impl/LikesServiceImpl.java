package com.sz.blinddata.service.impl;

import com.sz.blinddata.domain.Likes;
import com.sz.blinddata.mapper.LikesMapper;
import com.sz.blinddata.service.LikesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LikesServiceImpl implements LikesService {
    @Resource
    private LikesMapper likesMapper;
    @Override
    public boolean addLikes(Likes likes) {
        return likesMapper.addLikes(likes);
    }

    @Override
    public boolean deleteByAccountAndHid(Likes likes) {
        return likesMapper.deleteByAccountAndHid(likes);
    }

    @Override
    public boolean deleteByAccount(Likes likes) {
        return likesMapper.deleteByAccount(likes);
    }

    @Override
    public List<Likes> findAll() {
        return likesMapper.findAll();
    }

    @Override
    public List<Likes> findByAccount(Likes likes) {
        return likesMapper.findByAccount(likes);
    }
}
