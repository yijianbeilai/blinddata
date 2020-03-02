package com.sz.blinddata.controller;

import com.sz.blinddata.domain.Province;
import com.sz.blinddata.service.ProvinceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("province")
public class ProvinceController {
    @Resource
    private ProvinceService provinceService;
    @RequestMapping("getFirstProvince")
    public List<Province> getFirstProvince(){
        return provinceService.getFirstProvince();
    }
    @RequestMapping("getSecondAndThirdProvince")
    public List<Province> getSecondAndThirdProvince(Province province){
        return provinceService.getSecondAndThirdProvince(province);
    }
}
