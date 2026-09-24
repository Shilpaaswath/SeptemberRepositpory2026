//Swap two number with and without using third variable
package AugustDay1HW;
import java.util.Scanner;
public class Day1Swaptwonumbers {
  public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter first number as a");
		int a = number.nextInt();
		System.out.println("Enter second  number as b");
		int b = number.nextInt();	
		//Swap without using third variable    
	    a= a+b;
		b= a-b;
		a= a-b;		
		System.out.println("Swapped numbers without using third varaible ");
		System.out.println("After Swapping First number " + a);
		System.out.println("After Swapping Second Number " + b);		
		//swap using third variable	
		int temp = 0;		
		Scanner number2 = new Scanner(System.in);
		System.out.println("Enter first number as a");
		int c = number2.nextInt();
		System.out.println("Enter second  number as b");
		int d = number2.nextInt();		
		temp = c;
		c=d;
		d=c;		
		System.out.println("Swapped numbers using third varaible ");
		System.out.println("After Swapping First number " + c);
		System.out.println("After Swapping Second Number " +d);
	}

}
