package com.example.registrationSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "batch")
public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer batchId;

    @PositiveOrZero(message = "Either the count of students can be 0 or any positive number")
    private Integer studentsCount;

    @Enumerated(EnumType.STRING)
    private BatchStatus status = BatchStatus.ACTIVE;

    @OneToOne(cascade = CascadeType.ALL)
    private Courses course;

    @ManyToMany(cascade = CascadeType.ALL)
    private Instructor instructor;

    @OneToMany(mappedBy = "batch", cascade = CascadeType.ALL)
    private Set<Student> students;
}
