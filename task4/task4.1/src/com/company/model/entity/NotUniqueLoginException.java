package com.company.model.entity;

public class NotUniqueLoginException extends Exception{

    public NotUniqueLoginException(String errorMessage)  {
        super(errorMessage);
    }
}
