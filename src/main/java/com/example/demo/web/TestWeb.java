package com.example.demo.web;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * input description here
 *
 * @author wuyuzhao@meituan.com
 * @date 2021/7/9
 */
@RestController
public class TestWeb {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/test")
    public List<Person> findAll(){
        return personRepository.findAll();
    }

}
