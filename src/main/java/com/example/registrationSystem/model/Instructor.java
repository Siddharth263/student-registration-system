package com.example.registrationSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Instructor {

    @Id
    @GeneratedValue
    private  int instructor_id;
    private String name;
    private String status;
    private int assigned_batches;

    public int getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAssigned_batches() {
        return assigned_batches;
    }

    public void setAssigned_batches(int assigned_batches) {
        this.assigned_batches = assigned_batches;
    }
}
