
//to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
package AugustDay1HW;

import java.util.Scanner;

public class Mathematicaloperations {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = num.nextInt();

        System.out.print("Enter second number: ");
        int num2 = num.nextInt();

        int sum = num1 + num2;
        int multiply = num1 * num2;
        int subtract = num1 - num2;
        int divide = num1 / num2;
        double remainder = num1 % num2;

        System.out.println("Sum of two numbers " + sum);
        System.out.println("Multiplication of two numbers " + multiply);
        System.out.println("Subtraction of two numbers " + subtract);
        System.out.println("Division of two numbers" + divide);
        System.out.println("Remainder of two numbers " + remainder);

		
		

	}

}
