package com.sz.blinddata.mapper;

import com.sz.blinddata.domain.Likes;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface LikesMapper {
    boolean addLikes(Likes likes);
    boolean deleteByAccountAndHid(Likes likes);
    boolean deleteByAccount(Likes likes);
    List<Likes> findAll();
    List<Likes> findByAccount(Likes likes);
}
