package com.webservice.studentapi.controllers;


import com.webservice.studentapi.beans.StudentBean;
import com.webservice.studentapi.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping(value="/create")
    public StudentBean create(@RequestBody StudentBean student)
    {
       return  studentService.create(student);
    }


}
