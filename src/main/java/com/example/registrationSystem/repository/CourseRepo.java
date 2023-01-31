package com.example.registrationSystem.repository;

import com.example.registrationSystem.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Courses, Integer> {
}
