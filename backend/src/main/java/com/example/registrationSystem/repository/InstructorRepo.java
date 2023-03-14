package com.example.registrationSystem.repository;

import com.example.registrationSystem.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepo extends JpaRepository<Instructor, Integer> {
}
