
//WAP to find factorial (Iterative technique)
package AugustDay1HW;

public class Day1FactorialIterative {

	public static void main(String[] args) {
		int num =5;
		int factorial=1;
		
		
		for (int i=num;i>=1;i--)
		{
		    //factorial = 1;
			factorial = factorial*i;
		}
		
		System.out.println(factorial);

	}

}
