package com.bbro.test_api_jar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping
public class TestApiJarApplication {

    @GetMapping
    public String hw(){
        return "Hello world";
    }

    @GetMapping("obj")
    public ResponseData test(){
        List<User> users = new ArrayList<>();
        users.add(new User("userName1","password1"));
        users.add(new User("userName2","password2"));
        users.add(new User("userName3","password3"));
        users.add(new User("userName4","password4"));
        return new ResponseData((short)1,"Message text",users);
    }

    @PostMapping("date")
    public ResponseData date(@RequestBody DateForTable dateForTable){
        return new ResponseData(0,"success",dateForTable);
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApiJarApplication.class, args);
    }

}
