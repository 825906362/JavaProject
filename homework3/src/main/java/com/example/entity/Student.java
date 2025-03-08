package com.example.entity;

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String studentName;
    private String major;
    private String studentNumber;

    public Student(String studentName, String major, String studentNumber) {
        this.studentName = studentName;
        this.major = major;
        this.studentNumber = studentNumber;
    }

    public Student() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", major='" + major + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                '}';
    }
}