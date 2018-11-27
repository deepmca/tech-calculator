package com.tech.calculator.impl;

import java.util.HashMap;
import java.util.Map;

import com.tech.calculator.Calculator;
import com.tech.calculator.exception.CalculationException;
import com.tech.calculator.operations.Operation;

public class CalculatorImpl implements Calculator {

	private Map<String, String> operations = null;


	/**
	 * constructor.
	 */
	public CalculatorImpl() {
		this.operations = new HashMap<>();
		this.operations.put("+", "com.tech.calculator.operation.impl.AddOperation");
		this.operations.put("-", "com.tech.calculator.operation.impl.SubOperation");
		this.operations.put("*", "com.tech.calculator.operation.impl.MulOperation");
		this.operations.put("/", "com.tech.calculator.operation.impl.DivOperation");

		//TODO Add classes for scientific operations in next iteration
	}

	@Override
	public Double calc(Double number1, Double number2, String operator) throws CalculationException {
		if (!isOperationSupported(operator)) {
			throw new UnsupportedOperationException();
		}
		return getOperationClass(operator).operate(number1, number2);
	}

	private boolean isOperationSupported(String operator) {
		if (this.operations.containsKey(operator)) {
			return true;
		}
		return false;
	}


	private Operation getOperationClass(String operator) throws CalculationException {
		try {
			Class<Operation> cls = (Class<Operation>) Class.forName(this.operations.get(operator));
			return (Operation) cls.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CalculationException("Operation Initialization Exception");
		}
	}
}