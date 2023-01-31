package com.example.registrationSystem.repository;

import com.example.registrationSystem.model.Batch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchRepo extends JpaRepository<Batch, Integer> {
}
