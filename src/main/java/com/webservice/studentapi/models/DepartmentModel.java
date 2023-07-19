package com.webservice.studentapi.models;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name="Department")
public class DepartmentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String country;
    @Column
    private long numberOfStudents;
//    @Column
//    @OneToMany
//    List<StudentModel> students;
//    @Column
//    @OneToMany
//    List<CourseModel> courses;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(long numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

//    public List<StudentModel> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<StudentModel> students) {
//        this.students = students;
//    }

//    public List<CourseModel> getCourses() {
//        return courses;
//    }
//
//    public void setCourses(List<CourseModel> courses) {
//        this.courses = courses;
//    }
}
