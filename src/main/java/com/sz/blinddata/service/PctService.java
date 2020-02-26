package com.sz.blinddata.service;

import com.sz.blinddata.domain.Pct;

import java.util.List;

public interface PctService {
    boolean addPct(Pct pct);
    boolean addPctList(List<Pct> list);
}
