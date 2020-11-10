package com.thoughtworks.capability.gtb.restfulapidesign.exception;


public class GroupNotExistException extends RuntimeException {

    public GroupNotExistException(String message) {
        super(message);
    }
}