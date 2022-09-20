package com.devlopment.bookstore_cartservices.dto;

public class ExceptionResponse {
    public String errorMessage;

    public ExceptionResponse(String message) {
        this.errorMessage = message;
    }
}
