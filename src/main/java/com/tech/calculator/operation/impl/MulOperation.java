package com.tech.calculator.operation.impl;

import com.tech.calculator.operations.Operation;

/**
 * The method multiply the two given number.
 * Returns an Double object as a result .
 * <p>
 */
public class MulOperation implements Operation {

	public Double operate(Double firstNumber, Double secondNumber) {
		return firstNumber * secondNumber;
	}
}
