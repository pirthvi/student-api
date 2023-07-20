package com.webservice.studentapi.services;

import com.webservice.studentapi.beans.StudentBean;

public interface StudentService {
    StudentBean create(StudentBean studentBean);
    boolean update(StudentBean studentBean);
    boolean delete(StudentBean studentBean);
}
