package com.webservice.studentapi.services.impl;


import com.webservice.studentapi.dtos.StudentDTO;
import com.webservice.studentapi.models.StudentModel;
import com.webservice.studentapi.populators.StudentPopulator;
import com.webservice.studentapi.repositories.StudentRepo;
import com.webservice.studentapi.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;
    @Autowired
    StudentPopulator studentPopulator;

    @Override
    public StudentDTO create(StudentDTO studentDTO) {

        return studentPopulator.populate(studentRepo.save(studentPopulator.reversePopulate(studentDTO)));


    }

    @Override
    public StudentDTO update(StudentDTO studentDTO) {
        return null;
    }

    @Override
    public boolean delete(StudentDTO studentDTO) {
        return false;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        List<StudentModel> studentModels = studentRepo.findAll();
        List<StudentDTO> studentDTOS = new ArrayList<>();
        for (StudentModel studentModel : studentModels) {
            studentDTOS.add(studentPopulator.populate(studentModel));
        }
        return studentDTOS;
    }
}

