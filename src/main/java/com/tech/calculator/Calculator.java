package com.tech.calculator;

import com.tech.calculator.exception.CalculationException;

public interface Calculator {

    /**
     * Returns an Double object as a result .
     * The arguments must specify numbers in Double format and
     * operand in a String
     * <p>
     * This method calculate the given numbers based on the provided
     * operand
     * @param  firstNumber  first number for the calculation
     * @param  secondNumber second number for the calculation
     * @param  operator     operator for the calculation
     * @return the calculated number
     */
    public Double calc(Double firstNumber, Double secondNumber , String operator) throws CalculationException;

}
