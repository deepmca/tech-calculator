package com.tech.calculator.exception;

public class CalculationException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4603373311829428814L;
	
	private String message = null;

    public CalculationException() {
        super();
    }

    public CalculationException(String message) {
        super(message);
        this.message = message;
    }

    public CalculationException(Throwable cause) {
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
