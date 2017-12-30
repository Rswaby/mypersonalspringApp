package com.rohanswaby.controller;
import com.rohanswaby.SpringBoot.Application;
import com.rohanswaby.Model.Student2;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@RestController
@RequestMapping(value="/rest/student")
class StudentService{

    @RequestMapping(value="/",method = RequestMethod.GET)
    public HashMap<Long, Student2> getAllStudents(){
        return Application.hmStudent;
    }
}