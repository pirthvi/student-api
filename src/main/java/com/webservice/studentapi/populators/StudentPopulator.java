package com.webservice.studentapi.populators;

import com.webservice.studentapi.beans.StudentBean;
import com.webservice.studentapi.models.StudentModel;

public interface StudentPopulator {

    StudentBean populate(StudentModel studentModel);
    StudentModel reversePopulate(StudentBean studentBean);
}
