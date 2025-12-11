
package com.Spring.Boot.MVC.and.RESTful.APIs.module2.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}

