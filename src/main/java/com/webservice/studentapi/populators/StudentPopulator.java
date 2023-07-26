package com.webservice.studentapi.populators;

import com.webservice.studentapi.dtos.StudentDTO;
import com.webservice.studentapi.models.StudentModel;

public interface StudentPopulator {

    StudentDTO populate(StudentModel studentModel);
    StudentModel reversePopulate(StudentDTO studentDTO);
}
