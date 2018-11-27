package com.tech.calculator.exception;

public class UnSupportedException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3624649124999002075L;
	
	private String message = null;

    public UnSupportedException() {
        super();
    }

    public UnSupportedException(String message) {
        super(message);
        this.message = message;
    }

    public UnSupportedException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
