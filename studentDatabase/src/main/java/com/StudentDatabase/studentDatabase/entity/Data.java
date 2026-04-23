package com.StudentDatabase.studentDatabase.entity;

import jakarta.persistence.*;

@Entity
@Table(name="studentData")
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "email")
    private String email;

    @Column(name = "enrollmentDate")
    private String enrollmentDate;

    @Column(name = "gpa")
    private String gpa;

    public Data() {
    }

    public Data(String studentName, String email, String enrollmentDate, String gpa) {
        this.studentName = studentName;
        this.email = email;
        this.enrollmentDate = enrollmentDate;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", email='" + email + '\'' +
                ", enrollmentDate='" + enrollmentDate + '\'' +
                ", gpa='" + gpa + '\'' +
                '}';
    }

}
