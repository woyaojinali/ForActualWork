package com.rainbow.test.controller;

import com.rainbow.test.mapper.test1.PersonMapper;
import com.rainbow.test.mapper.test2.StatusMapper;
import com.rainbow.test.model.Person;
import com.rainbow.test.model.Status;
import com.rainbow.test.model.StatusExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private StatusMapper statusMapper;

    @RequestMapping("person")
    public @ResponseBody
    List<Person> getPerson(){
        List<Person> persons = personMapper.getPersons();
        return persons;
    }

    @RequestMapping("status")
    public @ResponseBody
    List<Status> getStatus(){
        StatusExample statusExample = new StatusExample();
        statusExample.createCriteria().andStatusCodeEqualTo("11");
        List<Status> statuses = statusMapper.selectByExample(statusExample);
        return statuses;
    }
}
