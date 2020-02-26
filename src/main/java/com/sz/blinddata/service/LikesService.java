package com.sz.blinddata.service;

import com.sz.blinddata.domain.Likes;

import java.util.List;

public interface LikesService {
    boolean addLikes(Likes likes);
    boolean deleteByAccountAndHid(Likes likes);
    boolean deleteByAccount(Likes likes);
    List<Likes> findAll();
    List<Likes> findByAccount(Likes likes);

}
