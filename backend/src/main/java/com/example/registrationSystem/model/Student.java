package com.example.registrationSystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int student_id;
    private String name;
    private String email;
    private String password;
    private String address;
    private int admission_fee;
    private int batch_enrolled;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAdmission_fee() {
        return admission_fee;
    }

    public void setAdmission_fee(int admission_fee) {
        this.admission_fee = admission_fee;
    }

    public int getBatch_enrolled() {
        return batch_enrolled;
    }

    public void setBatch_enrolled(int batch_enrolled) {
        this.batch_enrolled = batch_enrolled;
    }
}
