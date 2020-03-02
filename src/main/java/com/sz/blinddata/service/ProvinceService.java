package com.sz.blinddata.service;

import com.sz.blinddata.domain.Province;

import java.util.List;

public interface ProvinceService {
    List<Province> getPidName();
    List<Province> getProvinceListById(Province province);
}
