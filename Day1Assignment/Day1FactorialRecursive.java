//WAP to find factorial (Recursive technique)

package AugustDay1HW;

public class Day1FactorialRecursive {

	public static void main(String[] args) {
		
		
		int num =5;
		int factorial = fact(num);
		System.out.println(factorial);
	}
	
		
		
		
		public static int fact(int num)
		{
			
			if (num ==1)
			{
				return 1;
			}
			
				return num * fact(num-1);
			
			
		}

	}



