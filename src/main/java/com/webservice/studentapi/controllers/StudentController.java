package com.webservice.studentapi.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/student")
public class StudentController {
    @GetMapping(value="/get")
    public String getApi(){
        return "Hello";
    }

}
