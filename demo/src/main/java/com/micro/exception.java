package com.micro;

import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class exception {
@ExceptionHandler(NoSuchElementException.class)
public String ex() {
	return "no such user found";
}
}
