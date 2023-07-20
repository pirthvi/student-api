package com.webservice.studentapi.repositories;

import com.webservice.studentapi.models.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentModel, Integer> {

}
