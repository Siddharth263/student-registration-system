package com.example.registrationSystem.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.MethodNotAllowedException;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;
import java.util.Objects;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDetails> methodArgumentNotValidException(MethodArgumentNotValidException me, HttpServletRequest request) {
        ErrorDetails ed = new ErrorDetails();
        ed.setTimeStamp(LocalDateTime.now());
        ed.setDetails(Objects.requireNonNull(me.getBindingResult().getFieldError()).getDefaultMessage());
        ed.setMessage(request.getRequestURI());

        return ResponseEntity.badRequest().body(ed);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<ErrorDetails> noHandlerFoundException(NoHandlerFoundException ne, HttpServletRequest request) {
        ErrorDetails ed = new ErrorDetails();
        ed.setTimeStamp(LocalDateTime.now());
        ed.setDetails(ne.getLocalizedMessage());
        ed.setMessage(request.getRequestURI());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ed);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorDetails> runtimeException(RuntimeException re, HttpServletRequest request) {
        ErrorDetails ed = new ErrorDetails();
        ed.setTimeStamp(LocalDateTime.now());
        ed.setDetails(re.getLocalizedMessage());
        ed.setMessage(request.getRequestURI());

        return ResponseEntity.badRequest().body(ed);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> compileTimeException(Exception ex, HttpServletRequest request) {
        ErrorDetails ed = new ErrorDetails();
        ed.setTimeStamp(LocalDateTime.now());
        ed.setDetails(ex.getLocalizedMessage());
        ed.setMessage(request.getRequestURI());

        return ResponseEntity.badRequest().body(ed);
    }

    @ExceptionHandler(MethodNotAllowedException.class)
    public ResponseEntity<ErrorDetails> methodNotAllowedException(MethodNotAllowedException me, HttpServletRequest request) {
        ErrorDetails ed = new ErrorDetails();
        ed.setTimeStamp(LocalDateTime.now());
        ed.setDetails(me.getLocalizedMessage());
        ed.setMessage(request.getRequestURI());

        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(ed);
    }

    @ExceptionHandler(AdminException.class)
    public ResponseEntity<ErrorDetails> adminException(AdminException ex, HttpServletRequest request) {
        ErrorDetails ed = new ErrorDetails();
        ed.setTimeStamp(LocalDateTime.now());
        ed.setDetails(ex.getMessage());
        ed.setMessage(request.getRequestURI());

        return ResponseEntity.badRequest().body(ed);
    }

    @ExceptionHandler(BatchException.class)
    public ResponseEntity<ErrorDetails> batchException(BatchException ex, HttpServletRequest request) {
        ErrorDetails ed = new ErrorDetails();
        ed.setTimeStamp(LocalDateTime.now());
        ed.setDetails(ex.getMessage());
        ed.setMessage(request.getRequestURI());

        return ResponseEntity.badRequest().body(ed);
    }

    @ExceptionHandler(CoursesException.class)
    public ResponseEntity<ErrorDetails> coursesException(CoursesException ex, HttpServletRequest request) {
        ErrorDetails ed = new ErrorDetails();
        ed.setTimeStamp(LocalDateTime.now());
        ed.setDetails(ex.getMessage());
        ed.setMessage(request.getRequestURI());

        return ResponseEntity.badRequest().body(ed);
    }

    @ExceptionHandler(InstructorException.class)
    public ResponseEntity<ErrorDetails> instructorException(InstructorException ex, HttpServletRequest request) {
        ErrorDetails ed = new ErrorDetails();
        ed.setTimeStamp(LocalDateTime.now());
        ed.setDetails(ex.getMessage());
        ed.setMessage(request.getRequestURI());

        return ResponseEntity.badRequest().body(ed);
    }

    @ExceptionHandler(StudentException.class)
    public ResponseEntity<ErrorDetails> studentException(StudentException ex, HttpServletRequest request) {
        ErrorDetails ed = new ErrorDetails();
        ed.setTimeStamp(LocalDateTime.now());
        ed.setDetails(ex.getMessage());
        ed.setMessage(request.getRequestURI());

        return ResponseEntity.badRequest().body(ed);
    }
}
