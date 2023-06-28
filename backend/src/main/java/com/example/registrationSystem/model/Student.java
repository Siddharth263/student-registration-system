package com.example.registrationSystem.model;

import com.example.registrationSystem.customAnnotations.Password;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer student_id;

    @NotNull(message = "Name cannot be null")
    @NotBlank(message = "Name cannot be blank")
    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @Email
    private String email;

    @Password
    private String password;

    @NotNull(message = "Address cannot be null")
    @NotBlank(message = "Address cannot be blank")
    @NotEmpty(message = "Address cannot be empty")
    private String address;

    @Enumerated(EnumType.STRING)
    private Status status = Status.ACTIVE;

    @Positive
    private Integer admission_fee;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "courses_id")
    private Courses course;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "batch_batchId")
    private Batch batch;
}
