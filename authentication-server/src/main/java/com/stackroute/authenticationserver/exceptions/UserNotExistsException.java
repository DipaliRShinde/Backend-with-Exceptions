package com.stackroute.authenticationserver.exceptions;

public class UserNotExistsException extends Exception {

    private String message;

    public UserNotExistsException() {

    }

    public UserNotExistsException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

