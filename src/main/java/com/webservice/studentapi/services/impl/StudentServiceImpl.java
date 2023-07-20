package com.webservice.studentapi.services.impl;


import com.webservice.studentapi.beans.StudentBean;
import com.webservice.studentapi.populators.StudentPopulator;
import com.webservice.studentapi.repositories.StudentRepo;
import com.webservice.studentapi.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;
    @Autowired
    StudentPopulator studentPopulator;
    @Override
    public StudentBean create(StudentBean studentBean) {

       return studentPopulator.populate(studentRepo.save(studentPopulator.reversePopulate(studentBean)));


    }

    @Override
    public boolean update(StudentBean studentBean) {
        return false;
    }

    @Override
    public boolean delete(StudentBean studentBean) {
        return false;
    }
}
