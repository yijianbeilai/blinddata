package com.sz.blinddata.controller;

import com.sz.blinddata.domain.Person;
import com.sz.blinddata.service.PersonService;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {
    @Resource
    private PersonService personService;
    @RequestMapping("findAll")
    public List<Person> findAll(){
        return personService.findAll();
    }
    @RequestMapping("selectByAccount")
    public Person selectByAccount(Person person){
        return personService.selectByAccount(person);
    }
    @RequestMapping("deleteByAccount")
    public boolean deleteByAccount(Person person){
        return personService.deleteByAccount(person);
    }
    @RequestMapping("addPerson")
    public boolean addPerson(Person person){
        return personService.addPerson(person);
    }
    @RequestMapping("updatePnickname")
    public boolean updatePnickname(Person person){
        return personService.updatePnickname(person);
    }
    @RequestMapping("updatePicon")
    public boolean updatePicon(Person person){
        return personService.updatePicon(person);
    }
    @RequestMapping("uploadPicon")
    public boolean uploadPicon(@RequestParam("filename")MultipartFile file){
        String filename=file.getOriginalFilename();
        String path="F:\\githubdownload\\blinddata\\src\\main\\resources\\static\\html\\pic\\";
        File filep=new File(path+filename);
        try{
            file.transferTo(filep);
        }catch(IllegalStateException e){
            return  false;
        }catch(IOException e){
            return false;
        }
        Person person=new Person();
        person.setPicon(filename);
        person.setAccount("2534890334");
        personService.updatePicon(person);
        return true;
    }
    @RequestMapping("login")
    public boolean login(Person person, HttpServletRequest request){
        Person person1=  personService.login(person);
        if(person1!=null){
            request.getSession().setAttribute("person",person1);
            return true;
        }
        else
            return false;
    }
    @RequestMapping("getPnicknameBySession")
    public Person getPnicknameBySession(HttpServletRequest request){
        Person person=(Person)request.getSession().getAttribute("person");
        return person;
    }
    @RequestMapping("signup")
    public boolean signup(Person person){
        return personService.signup(person);
    }
}
