package com.tech;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tech.calculator.Calculator;
import com.tech.calculator.exception.CalculationException;
import com.tech.calculator.impl.CalculatorImpl;

/**
 * Unit test for simple CalculatorApp.
 */
public class CalculatorAppTest {

    @Test
    public void testAdd() throws CalculationException{
        Calculator calculator = new CalculatorImpl();

        Double number1 = Double.valueOf(1);
        Double number2 = Double.valueOf(2);

        Double result = Double.valueOf(3);

        assertEquals(result
                , calculator.calc(number1, number2, "+"));
    }

    @Test
    public void testMultiply() throws CalculationException{
        Calculator calculator = new CalculatorImpl();

        Double number1 = Double.valueOf(10);
        Double number2 = Double.valueOf(20);

        Double result = Double.valueOf(200);

        assertEquals(result
                , calculator.calc(number1, number2, "*"));
    }

    @Test
    public void testSubstraction() throws CalculationException{
        Calculator calculator = new CalculatorImpl();

        Double number1 = Double.valueOf(10);
        Double number2 = Double.valueOf(5);

        Double result = Double.valueOf(5);

        assertEquals(result
                , calculator.calc(number1, number2, "-"));
    }

    @Test
    public void testDivision() throws CalculationException{
        Calculator calculator = new CalculatorImpl();

        Double number1 = Double.valueOf(20);
        Double number2 = Double.valueOf(5);

        Double result = Double.valueOf(4);

        assertEquals(result
                , calculator.calc(number1, number2, "/"));
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testOperationNotSupported() throws CalculationException{
        Calculator calculator = new CalculatorImpl();

        Double number1 = Double.valueOf(20);
        Double number2 = Double.valueOf(5);
        calculator.calc(number1, number2, "^");
    }
}
