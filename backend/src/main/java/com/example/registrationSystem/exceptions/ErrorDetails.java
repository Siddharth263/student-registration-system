package com.example.registrationSystem.exceptions;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class ErrorDetails {
    private String message;
    private LocalDateTime timeStamp;
    private String details;
}
