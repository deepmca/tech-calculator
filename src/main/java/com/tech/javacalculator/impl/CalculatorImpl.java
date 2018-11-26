package com.tech.javacalculator.impl;

import com.tech.javacalculator.Calculator;

public class CalculatorImpl implements Calculator {


    @Override
    public Double calculateSimpleMode(Double number1, Double number2, String operator) {

        double result = Double.NaN ;

        switch (operator){

            case "+" :
                result = number1 + number2 ;
                break;

            case "-" :
                result = number1 - number2 ;
                break;

            case "*" :
                result = number1 * number2 ;
                break;

            case "/" :
                result = number1 / number2 ;
                break;

        }

        return result ;

    }

}
