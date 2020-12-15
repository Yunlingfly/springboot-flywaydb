package cn.yunlingfly.springbootflywaydb.controller;

import cn.yunlingfly.springbootflywaydb.entity.PersonEntity;
import cn.yunlingfly.springbootflywaydb.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    PersonMapper personMapper;

    @GetMapping("/get")
    public PersonEntity get() {
        return personMapper.selectById("1");
    }
}
