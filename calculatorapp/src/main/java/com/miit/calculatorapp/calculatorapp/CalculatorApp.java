package com.miit.calculatorapp.calculatorapp;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class CalculatorApp 
{
	public static void main(String args[])
	{
		Calculator cal = new Calculator();
		
		// create an object of Scanner class
		    Scanner input = new Scanner(System.in);
		    
		    int option;
		    char key;
		    double number1, number2, result;
		    boolean data = true;
		    
    while(data == true)
    {    
    	System.out.println("Calculator App:\nSelect the options to perform basic math operations!!\n1.Addition"
    							+ "\n2.Substraction\n3.Multiplication\n4.Division");
    	option = input.nextInt();	
    	
    		System.out.println("Enter the first number:");
    		number1 = input.nextDouble();	    			
    		System.out.println("Enter the second number:");
    		number2 = input.nextDouble();
	
	    	switch(option)
	    	{
		    	case 1:
		    		result = cal.add(number1, number2);
		    		System.out.println("Your sum is:" + result);
		    		break;
		    	case 2:
		    		result = cal.sub(number1, number2);
		    		System.out.println("Your substraction is:" + result);
		    		break;
		    	case 3:
		    		result = cal.mul(number1, number2);
		    		System.out.println("Your multiplication is:" + result);
		    		break;
		    	case 4:
		    		result = cal.div(number1, number2);
		    		System.out.println("Your division is:" + result);
		    		break;
		    		default:
		    			System.out.println("Please enter the valid input!!");
		    			break;    
	    	}
	    	    	
    	System.out.println("Do you want to continue?? Please press y, otherwise press other key");
    	key = input.next().charAt(0);
    	
	    	if(key == 'y'){
	    		data = true;
	    	}
	    	else
	    	{
	    		data = false;
	    		
	    	}
    	
    }
	
}

}
