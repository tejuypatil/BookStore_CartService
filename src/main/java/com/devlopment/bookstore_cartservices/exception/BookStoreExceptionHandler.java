package com.devlopment.bookstore_cartservices.exception;

import com.devlopment.bookstore_cartservices.dto.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BookStoreExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ExceptionResponse> invalidTokenException(InvalidTokenException invalidTokenException){
        ExceptionResponse exceptionResponse = new ExceptionResponse(invalidTokenException.getMessage());
        return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
}
