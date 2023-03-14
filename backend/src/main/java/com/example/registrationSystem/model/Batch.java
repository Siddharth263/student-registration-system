package com.example.registrationSystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "batch")
public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int batch_id;
    private int course_id;
    private int seat_available;
    private int max_seat;
    private int instructor_id;

    public int getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(int batch_id) {
        this.batch_id = batch_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getSeat_available() {
        return seat_available;
    }

    public void setSeat_available(int seat_available) {
        this.seat_available = seat_available;
    }

    public int getMax_seat() {
        return max_seat;
    }

    public void setMax_seat(int max_seat) {
        this.max_seat = max_seat;
    }

    public int getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }
}
