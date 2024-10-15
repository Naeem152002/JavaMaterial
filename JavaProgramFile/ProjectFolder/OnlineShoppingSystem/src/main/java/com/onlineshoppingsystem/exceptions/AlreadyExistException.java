package com.onlineshoppingsystem.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlreadyExistException extends RuntimeException {
	private String resourceName;
    public AlreadyExistException(String resourceName) {
        super(String.format("%s",resourceName));
        this.resourceName=resourceName;
    }
}
