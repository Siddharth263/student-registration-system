package com.example.registrationSystem.exceptions;

public class BatchException extends RuntimeException{
    public BatchException() {
    }

    public BatchException(String message) {
        super(message);
    }
}
