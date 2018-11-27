package com.zero.bean;

public class Student {
    private Integer studentId;

    private String studentName;

    private String studentGrade;

    private String studentClass;

    private String studentCollege;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade == null ? null : studentGrade.trim();
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass == null ? null : studentClass.trim();
    }

    public String getStudentCollege() {
        return studentCollege;
    }

    public void setStudentCollege(String studentCollege) {
        this.studentCollege = studentCollege == null ? null : studentCollege.trim();
    }
}