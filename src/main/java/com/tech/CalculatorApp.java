package com.tech;

import com.tech.calculator.Calculator;
import com.tech.calculator.exception.CalculationException;
import com.tech.calculator.impl.CalculatorImpl;

/**
 * Calculator Application
 *
 */
public class CalculatorApp
{
    public static void main( String[] args ) {

        if(args.length == 3){
            try{
                Double number1 = Double.parseDouble(args[0]) ;
                Double number2 = Double.parseDouble(args[2]) ;
                String operand = args[1] ;

                Calculator calculator = new CalculatorImpl() ;
                Double result  = calculator.calc(number1,number2,operand);
                System.out.println("--------------------");
                System.out.println("Result is : "+ result);
                System.out.println("--------------------");


            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Please enter arguments in proper format, for example : <num1><space>+<space><num2>");

            }catch (UnsupportedOperationException ex){
                System.out.println("Operation is not supported...");

            }catch (CalculationException ex){
                System.out.println("Something went wrong: "+ex.getLocalizedMessage());

            }
        }else {
            System.out.println("Info :- Please enter numbers for calculation in proper format");
        }

    }
}
