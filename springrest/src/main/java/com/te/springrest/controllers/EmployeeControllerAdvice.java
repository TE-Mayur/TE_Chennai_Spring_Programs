package com.te.springrest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.springrest.beans.EmployeeResponse;
import com.te.springrest.exceptions.EmployeesException;

@RestControllerAdvice
public class EmployeeControllerAdvice {
	
	@ExceptionHandler(EmployeesException.class)
	public ResponseEntity<EmployeeResponse> handleExp(EmployeesException exception){
	EmployeeResponse employeeResponse = new EmployeeResponse(true, exception.getMessage());
		return new ResponseEntity<EmployeeResponse>(employeeResponse, HttpStatus.NOT_FOUND);
	}

}
