//find largest of three numbers and largest of two numbers
//Two methods created with same name while different parameters this is method overloading

package Day2Assignement;

import java.util.Scanner;

public class Largestoftwoandthreenumbers {

	 static void largest(int a, int b, int c)
	    {
	    	if (a>b && a>c)
	    	{
	    		System.out.println("a ia largest of all 3 numbers");
	    	}
	    	if (b>c)
	    	{
	    		System.out.println("b ia largest of all 3 numbers");
	    	}
	    	else
	    	{
	    		System.out.println("c ia largest of all 3 numbers");
	    	}
	    	
	    }

	    static void largest(int a , int b)
	    {
	    	if (a>b)
	    	{
	    		System.out.println("Value a ia largest of 2 numbers");
	    	}
	    	else
	    	{
	    		System.out.println("Value b ia largest of of 2 numbers");
	    	}
	    }
	    
		public static void main(String[] args) {
			
			Scanner value = new Scanner(System.in);
			System.out.println("Enter First value");
			int a = value.nextInt();
			System.out.println("Enter second value");
			int b = value.nextInt();
			System.out.println("Enter third value");
			int c = value.nextInt();
			
			largest(a,b,c);
			largest(a,b);	
					

		}

	}


