package com.example.registrationSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "instructor")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer instructor_id;

    @NotNull(message = "Name cannot be null")
    @NotBlank(message = "Name cannot be blank")
    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @Enumerated(EnumType.STRING)
    private Status status = Status.ACTIVE;

    @PositiveOrZero
    private Integer assigned_batches = 0;

    @ManyToMany(mappedBy = "instructor", fetch = FetchType.EAGER)
    private Batch batch;

    @OneToMany(mappedBy = "instructor")
    @JoinColumn(name = "courses_courseId")
    private Set<Courses> course;
}
