package com.tect.calculator.operation.impl;

import com.tech.calculator.operations.Operation;

/**
 * The method divide the two given number.
 * Returns an Double object as a result .
 * <p>
 */
public class DivOperation implements Operation {

	public Double operate(Double firstNumber, Double secondNumber) {
		return firstNumber / secondNumber;
	}
}
