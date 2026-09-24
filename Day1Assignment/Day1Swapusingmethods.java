//Swap two number with and without using third variable

//Swap using invoking methods defined inside class

package AugustDay1HW;

import java.util.Scanner;

class Numberswap
 {
	 
	 int a;
	 int b;
	 int c;
	 int d;
	public void Swapwithoutthirdvariable()
	{
		
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("Swapped numbers without using third varaible ");
		System.out.println("After Swapping First number " + a);
		System.out.println("After Swapping Second Number " + b);	
		
	}
	
	public void Swapusingthirdvariable()
	{
	
		
		int temp;
		temp =c;
		c=d;
		d=temp;
		
		System.out.println("Swapped numbers  using third varaible ");
		System.out.println("After Swapping First number " + c);
		System.out.println("After Swapping Second Number " + d);	
		
	}
	
 }



public class Day1Swapusingmethods {

	public static void main(String[] args) {
		
		
		
		Numberswap swap = new Numberswap();
		
		
		Scanner number1 = new Scanner(System.in);
		System.out.println("Enter first number as a");
		swap.a = number1.nextInt();
		System.out.println("Enter second  number as b");
		swap.b = number1.nextInt();
		
		swap.Swapwithoutthirdvariable();
		
		System.out.println();
		
		//Scanner number2 = new Scanner(System.in);
		System.out.println("Enter first number as a");
		swap.c = number1.nextInt();
		System.out.println("Enter second  number as b");
		swap.d = number1.nextInt();
		
		swap.Swapusingthirdvariable();
		
	}

}
