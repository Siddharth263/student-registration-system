package com.example.registrationSystem.repository;

import com.example.registrationSystem.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
}
