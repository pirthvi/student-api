package com.webservice.studentapi.services;

import com.webservice.studentapi.dtos.StudentDTO;

import java.util.List;

public interface StudentService {
    StudentDTO create(StudentDTO studentDTO);
    StudentDTO update(StudentDTO studentDTO);
    boolean delete(StudentDTO studentDTO);
    List<StudentDTO> getAllStudents();
}
