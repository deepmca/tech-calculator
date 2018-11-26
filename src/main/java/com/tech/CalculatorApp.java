package com.tech;

import com.tech.javacalculator.CalculationException;
import com.tech.javacalculator.Calculator;
import com.tech.javacalculator.impl.CalculatorImpl;

/**
 * Hello world!
 *
 */
public class CalculatorApp
{
    public static void main( String[] args ) {

        if(args.length > 0){

            try{
                Double number1 = Double.parseDouble(args[0]) ;
                Double number2 = Double.parseDouble(args[2]) ;
                String operand = args[1] ;

                Calculator calculator = new CalculatorImpl() ;
                Double result  = calculator.simpleModeCalulation(number1,number2,operand);
                System.out.println("--------------------");
                System.out.println("Result is : "+ result);
                System.out.println("--------------------");


            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Please enter arguments in proper format, for example : num1 + num2 ");

            }
        }else {
            System.out.println("Info :- Please enter numbers for calculation");
        }

    }
}
