package com.creative.solutions.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ClientExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<GenericExceptionResponse> handleAllExceptions(Exception e) {
        GenericExceptionResponse error = new GenericExceptionResponse("INTERNAL_SERVER_ERROR", e.getMessage());
        error.setTimestamp(LocalDateTime.now());
        error.setStatus((HttpStatus.INTERNAL_SERVER_ERROR.value()));
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<GenericExceptionResponse> handleNotFoundException(NotFoundException e) {
        GenericExceptionResponse error = new GenericExceptionResponse("NOT_FOUND_ERROR", e.getMessage());
        error.setTimestamp(LocalDateTime.now());
        error.setStatus((HttpStatus.NOT_FOUND.value()));
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    //@ExceptionHandler(value = AccessDeniedError.class)
    public ResponseEntity<GenericExceptionResponse> handleAccessDeniedException(NotFoundException e) {
        GenericExceptionResponse error = new GenericExceptionResponse("ACCESS_DENIED", e.getMessage());
        error.setTimestamp(LocalDateTime.now());
        error.setStatus((HttpStatus.FORBIDDEN.value()));
        return new ResponseEntity<>(error, HttpStatus.FORBIDDEN);
    }
}
