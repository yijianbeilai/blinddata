package com.sz.blinddata;

import com.sz.blinddata.domain.Hobby;
import com.sz.blinddata.domain.Likes;
import com.sz.blinddata.domain.Person;
import com.sz.blinddata.service.HobbyService;
import com.sz.blinddata.service.LikesService;
import com.sz.blinddata.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class testLike {
    @Resource
    private LikesService likesService;
    @Resource
    private PersonService personService;
    @Resource
    private HobbyService hobbyService;
    @Test
    public void addLike(){
        Likes likes = new Likes();
        Person person = new Person();
        person.setAccount("2534890334");
        person = personService.selectByAccount(person);
        Hobby hobby = new Hobby();
        hobby.setHid("0200");
        hobby=hobbyService.selectByHid(hobby);
        likes.setLid(1);
        likes.setHobby(hobby);
        likes.setPerson(person);
        likesService.addLikes(likes);
    }
    @Test
    public void del2(){
        Likes likes = new Likes();
        Person person = new Person();
        person.setAccount("2534890334");
        likes.setPerson(person);
        likesService.deleteByAccount(likes);
    }
    @Test
    public void del1(){
        Likes likes = new Likes();
        Person person = new Person();
        person.setAccount("2534890334");

        Hobby hobby = new Hobby();
        hobby.setHid("0200");
        likes.setHobby(hobby);
        likes.setPerson(person);
        likesService.deleteByAccountAndHid(likes);
    }
    @Test
    public void getLikes2(){
        Person person = new Person();
        person.setAccount("2534890334");
        Likes likes = new Likes();
        likes.setPerson(person);
        List<Likes> list =likesService.findByAccount(likes);
        for(Likes likes1:list){}
    }
    @Test
     public void getLikes(){
        List<Likes> list= likesService.findAll();
        for(Likes likes:list){
            System.out.println();
        }
    }
}
