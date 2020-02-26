package com.sz.blinddata;

import com.sz.blinddata.domain.Pct;
import com.sz.blinddata.domain.Person;
import com.sz.blinddata.service.PctService;
import com.sz.blinddata.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class BlinddataApplicationTests {

    @Resource
    private PersonService personService;
    @Test
    void contextLoads() {
    }
    @Test
    public void teatAdd(){
        Person person= new Person();
        person.setPname("xmy");
        person.setPid("412728199606164216");
        person.setPage(24);
        person.setAccount("3566639733");
        person.setPassword("wang1996");
        person.setPsex("男");
        person.setPnickname("helloworld");
        boolean isTrue=personService.addPerson(person);
        System.out.println(isTrue);
    }

    @Test
    public void testFindAll(){
        List<Person> list=personService.findAll();
        for(Person person:list){
            System.out.println(person.getPname());
        }
    }
    @Test
    public void testFindbyaccout(){
        Person person = new Person();
        person.setAccount("2534890334");
        person=personService.selectByAccount(person);
        System.out.println(person.getPname());
    }
    @Test
    public void testupdate(){
        Person person = new Person();
        person.setAccount("2534890334");
        person.setPnickname("yijianxilai");
        personService.updatePnickname(person);
    }
    @Test
    public void Delete(){
        Person person=new Person();
        person.setAccount("3566639733");
        personService.deleteByAccount(person);
    }
    @Resource
    private PctService pctService;
    @Test
    public void addPct(){
        Timestamp ts = new Timestamp(new Date().getTime());
         Pct pct= new Pct();
         pct.setAccount("3147448393");
         pct.setPtime(ts);
         pctService.addPct(pct);
    }
    @Test
    public void addPctList(){
        List<Pct> list= new ArrayList<>();
        long l=3147448393L;
        for(int i=1;i<=100;i++){
            Pct pct= new Pct();
            pct.setPtime(new Timestamp(new Date().getTime()));
            pct.setAccount(l+i+"");
            list.add(pct);
        }
        pctService.addPctList(list);
    }
}
