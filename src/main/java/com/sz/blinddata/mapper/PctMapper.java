package com.sz.blinddata.mapper;

import com.sz.blinddata.domain.Pct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component

public interface PctMapper {
    boolean addPct(Pct pct);
    boolean addPctList(List<Pct> list);
}
