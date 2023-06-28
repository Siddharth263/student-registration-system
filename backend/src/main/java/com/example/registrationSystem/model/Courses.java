package com.example.registrationSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer courseID;

    @NotNull(message = "Name cannot be null")
    @NotBlank(message = "Name cannot be blank")
    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @Enumerated(EnumType.STRING)
    private Status status = Status.ACTIVE;

    @Positive
    private Integer fee;

    @OneToOne(mappedBy = "course", fetch = FetchType.EAGER)
    private Batch batch;

    @ManyToOne(cascade =  CascadeType.ALL)
    private Instructor instructor;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<Student> students;
}
