package com.tech.calculator.operations;

import com.tech.calculator.exception.CalculationException;

/**
 * Returns an Double object as a result .
 * The arguments must specify numbers in Double format
 * <p>
 * @param  firstNumber  first number for the calculation
 * @param  secondNumber second number for the calculation
 * @return the calculated number
 */
public interface Operation {

	public Double operate(Double firstNumber, Double secondNumber) throws CalculationException;
}
