package com.tect.calculator.operation.impl;

import com.tech.calculator.operations.Operation;

/**
 * The method subtract the two given number.
 * Returns an Double object as a result .
 * <p>
 */
public class SubOperation implements Operation {

	public Double operate(Double firstNumber, Double secondNumber) {
		return firstNumber - secondNumber;
	}
}
