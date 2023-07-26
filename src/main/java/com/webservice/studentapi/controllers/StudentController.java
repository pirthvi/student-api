package com.webservice.studentapi.controllers;


import com.webservice.studentapi.dtos.StudentDTO;
import com.webservice.studentapi.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping(value="/create")
    public ResponseEntity<StudentDTO> create(@RequestBody StudentDTO student)
    {
        return  new ResponseEntity<>(studentService.create(student), HttpStatus.OK);

    }
    @GetMapping(value = "/getAll")
    public ResponseEntity<List<StudentDTO>> getAll(){
        return  new ResponseEntity<>(studentService.getAllStudents(),HttpStatus.OK);
    }


}
