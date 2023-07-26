package com.webservice.studentapi.populators.impl;

import com.webservice.studentapi.dtos.StudentDTO;
import com.webservice.studentapi.models.StudentModel;
import com.webservice.studentapi.populators.StudentPopulator;

public class StudentPopulatorImpl implements StudentPopulator {


    @Override
    public StudentDTO populate(StudentModel studentModel) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(studentModel.getId());
        studentDTO.setName(studentModel.getName());
        studentDTO.setCountry(studentModel.getCountry());
        studentDTO.setAddress(studentModel.getAddress());
        studentDTO.setContactNumber(studentModel.getContactNumber());
        studentDTO.setFatherName(studentModel.getFatherName());
        studentDTO.setGender(studentModel.getGender());
        studentDTO.setProvince(studentModel.getProvince());
        studentDTO.setReligion(studentModel.getReligion());
        studentDTO.setCountry(studentModel.getCountry());
        
        return studentDTO;
    }

    @Override
    public StudentModel reversePopulate(StudentDTO studentDTO) {
        StudentModel studentModel = new StudentModel();
        studentModel.setName(studentDTO.getName());

        return studentModel;
    }
}
