package com.sz.blinddata.service.impl;

import com.sz.blinddata.domain.Pct;
import com.sz.blinddata.mapper.PctMapper;
import com.sz.blinddata.service.PctService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PctServiceImpl implements PctService {
    @Resource
    private PctMapper pctMapper;
    @Override
    public boolean addPct(Pct pct) {
        return pctMapper.addPct(pct);
    }

    @Override
    public boolean addPctList(List<Pct> list) {
        return pctMapper.addPctList(list);
    }
}
