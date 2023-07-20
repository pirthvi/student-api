package com.webservice.studentapi.models;

import jakarta.persistence.*;


import java.util.Date;
@Entity
@Table(name="student")
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
   private Date dateOfBirth;
//    @Column
//    private String address;
//    @Column
//    private String fatherName;
//    @Column
//    private String contactNumber;
//    @Column
//    private String gender;
//    @Column
//    private String motherName;
//    @Column
//    private String year;
//    @Column
//    private String province;
//    @Column
//    private String country;
//    @Column
//    private String religion;
//    @Column
//    @ManyToOne
//    private DepartmentModel department;
//    @Column
//    @ManyToOne
//    private CourseModel course;


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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getFatherName() {
//        return fatherName;
//    }
//
//    public void setFatherName(String fatherName) {
//        this.fatherName = fatherName;
//    }
//
//    public String getContactNumber() {
//        return contactNumber;
//    }
//
//    public void setContactNumber(String contactNumber) {
//        this.contactNumber = contactNumber;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String getMotherName() {
//        return motherName;
//    }
//
//    public void setMotherName(String motherName) {
//        this.motherName = motherName;
//    }
//
//    public String getYear() {
//        return year;
//    }
//
//    public void setYear(String year) {
//        this.year = year;
//    }
//
//    public String getProvince() {
//        return province;
//    }
//
//    public void setProvince(String province) {
//        this.province = province;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public String getReligion() {
//        return religion;
//    }
//
//    public void setReligion(String religion) {
//        this.religion = religion;
//    }
//

}
