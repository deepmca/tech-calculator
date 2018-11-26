package com.tech.javacalculator;

public class CalculationException extends Exception {

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
