package com.manager.customer.customermanager.exception;

public class CustomerBadRequestException extends RuntimeException{
    public CustomerBadRequestException(String message) {
        super(message);
    }
}
