package org.te.ems.controllers;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.te.ems.customexception.EmployeesException;
import org.te.ems.customexception.EntityNotFoundExp;

@ControllerAdvice
public class EmployeesControllerAdvice {

	@ExceptionHandler
	public String handleEntityExc(EmployeesException exp, HttpServletRequest req) {
		req.setAttribute("err", exp.getMessage());
		return "LoginForm";
	}

	@ExceptionHandler
	public String handleEntNotFou(EntityNotFoundExp exp, HttpServletRequest req) {
		req.setAttribute("msg", exp.getMessage());
		return "delete";
	}
}
