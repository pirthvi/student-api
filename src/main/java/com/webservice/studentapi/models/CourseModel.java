package com.webservice.studentapi.models;

import jakarta.persistence.*;

@Entity
@Table(name="Course")
public class CourseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column
    String name;
//    @Column
//    @ManyToOne
//
//    DepartmentModel department;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public DepartmentModel getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(DepartmentModel department) {
//        this.department = department;
//    }
}
