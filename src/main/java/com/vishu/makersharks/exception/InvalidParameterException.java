package com.vishu.makersharks.exception;

public class InvalidParameterException extends RuntimeException{

    public InvalidParameterException (String param) {
        super(param);
    }
}
