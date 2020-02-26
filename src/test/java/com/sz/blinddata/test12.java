package com.sz.blinddata;

import com.sz.blinddata.domain.Hobby;
import com.sz.blinddata.service.HobbyService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class test12 {
    @Resource
    private HobbyService hobbyService;
    @Test
    public void addHobby(){
        Hobby hobby=new Hobby();
        hobby.setHid("02");
        hobby.setPhid("0");
        hobby.setHname("语言");
        hobbyService.addHobby(hobby);
    }
    @Test
    public void getHobby(){
        List<Hobby> list = new ArrayList<>();
        list = hobbyService.findAll();
        for(Hobby hobby:list){
            System.out.println(hobby.getHid()+" " +hobby.getHname());
        }
    }
    @Test
    public void updateHobby(){
        Hobby hobby = new Hobby();
        hobby.setHid("02");
        hobby.setHname("语言");
        hobbyService.updateHobbyHname(hobby);
    }
    @Test
    public void findBo(){
        Hobby hobby = new Hobby();
        hobby.setHid("00");
        hobby = hobbyService.selectByHid(hobby);
        System.out.println(hobby.getHname());
    }
    @Test
    public void delete(){
        Hobby hobby= new Hobby();
        hobby.setHid("02");
        hobbyService.deleteByHid(hobby);
    }
    @Test
    public void addList(){
        List<Hobby> list = new ArrayList<>();
        Hobby hobby1= new Hobby();
        hobby1.setHid("0200");
        hobby1.setPhid("02");
        hobby1.setHname("java");
        Hobby hobby2= new Hobby();
        hobby2.setHid("0201");
        hobby2.setPhid("02");
        hobby2.setHname("php");
        Hobby hobby3= new Hobby();
        hobby3.setHid("0202");
        hobby3.setPhid("02");
        hobby3.setHname("c++");
        Hobby hobby4= new Hobby();
        hobby4.setHid("0203");
        hobby4.setPhid("02");
        hobby4.setHname("c");
        Hobby hobby5= new Hobby();
        hobby5.setHid("0204");
        hobby5.setPhid("02");
        hobby5.setHname("c#");
        list.add(hobby1);
        list.add(hobby2);
        list.add(hobby3);
        list.add(hobby4);
        list.add(hobby5);
        hobbyService.addHobbyList(list);
    }
}
