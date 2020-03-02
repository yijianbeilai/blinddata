package com.sz.blinddata.mapper;

import com.sz.blinddata.domain.Province;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ProvinceMapper {
    List<Province> getPidName();
    List<Province> getProvinceListById(Province province);
}
