package com.tech.calculator.operations;

import com.tech.calculator.exception.CalculationException;

public interface Operation {

	public Double operate(Double number1, Double number2) throws CalculationException;
}
