package com.example.demo.exceptions;

public class UserCredentialsIncorrectException extends RuntimeException {
    public UserCredentialsIncorrectException(String message) {
        super(message);
    }
}
