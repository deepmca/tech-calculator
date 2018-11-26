package com.tech;


import static org.junit.Assert.*;

import com.tech.javacalculator.CalculationException;
import com.tech.javacalculator.Calculator;
import com.tech.javacalculator.impl.CalculatorImpl;
import org.junit.Test;

/**
 * Unit test for simple CalculatorApp.
 */
public class CalculatorAppTest {

    @Test
    public void testAdd() {
        Calculator calculator = new CalculatorImpl();

        Double number1 = Double.valueOf(1);
        Double number2 = Double.valueOf(2);

        Double result = Double.valueOf(3);

        assertEquals(result
                , calculator.simpleModeCalulation(number1, number2, "+"));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new CalculatorImpl();

        Double number1 = Double.valueOf(10);
        Double number2 = Double.valueOf(20);

        Double result = Double.valueOf(200);

        assertEquals(result
                , calculator.simpleModeCalulation(number1, number2, "*"));
    }

    @Test
    public void testSubstraction() {
        Calculator calculator = new CalculatorImpl();

        Double number1 = Double.valueOf(10);
        Double number2 = Double.valueOf(5);

        Double result = Double.valueOf(5);

        assertEquals(result
                , calculator.simpleModeCalulation(number1, number2, "-"));
    }

    @Test
    public void testDivision() {
        Calculator calculator = new CalculatorImpl();

        Double number1 = Double.valueOf(20);
        Double number2 = Double.valueOf(5);

        Double result = Double.valueOf(4);

        assertEquals(result
                , calculator.simpleModeCalulation(number1, number2, "/"));
    }
}
