package com.employee.exception;

public class DataNotFoundException extends Exception {
    private long serialVersionUID;

    public DataNotFoundException(String message) {
        super(message);
    }
}
