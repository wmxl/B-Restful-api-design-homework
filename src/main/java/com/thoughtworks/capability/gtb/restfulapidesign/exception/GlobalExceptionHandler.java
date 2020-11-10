package com.thoughtworks.capability.gtb.restfulapidesign.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

//  @ExceptionHandler(StudentNotExistException.class)
//  @ResponseStatus(HttpStatus.NOT_FOUND)
//  @ResponseBody
//  public ErrorResult handle(StudentNotExistException ex) {
//    return new ErrorResult(ex.getMessage());
//  }

  @ExceptionHandler(StudentNotExistException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  @ResponseBody
  public ErrorResult handle(StudentNotExistException ex) {
    return new ErrorResult(ex.getMessage());
  }

}
