package com.webservice.studentapi.populators.impl;

import com.webservice.studentapi.beans.StudentBean;
import com.webservice.studentapi.models.StudentModel;
import com.webservice.studentapi.populators.StudentPopulator;

public class StudentPopulatorImpl implements StudentPopulator {


    @Override
    public StudentBean populate(StudentModel studentModel) {
        StudentBean studentBean= new StudentBean();
        studentBean.setId(studentModel.getId());
        studentBean.setName(studentModel.getName());
        return studentBean;
    }

    @Override
    public StudentModel reversePopulate(StudentBean studentBean) {
        StudentModel studentModel = new StudentModel();
        studentModel.setName(studentBean.getName());

        return studentModel;
    }
}
