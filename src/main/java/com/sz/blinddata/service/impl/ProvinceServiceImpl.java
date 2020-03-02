package com.sz.blinddata.service.impl;

import com.sz.blinddata.domain.Province;
import com.sz.blinddata.mapper.ProvinceMapper;
import com.sz.blinddata.service.ProvinceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Resource
    private ProvinceMapper provinceMapper;
    @Override
    public List<Province> getPidName() {
        return provinceMapper.getPidName();
    }

    @Override
    public List<Province> getProvinceListById(Province province) {
        return provinceMapper.getProvinceListById(province);
    }
}
