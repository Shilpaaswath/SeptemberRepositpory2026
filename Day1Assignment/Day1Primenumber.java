//WAP to check whether the given number is prime or not

package AugustDay1HW;

import java.util.Scanner;

class prime
{
	//boolean isprime;
	
	public void primenumber(int num)
	{
		boolean isprime=true;
		for (int i=2;i<num;i++)
		{
			
			if (num % i == 0)
			{
				isprime = false;
				break;
			}
			
		}
		
		if (isprime == true) {
			System.out.println("the number is prime");
		}else
		{
			System.out.println("the number is not prime");
		}
		
	
		
		
	}
}

public class Day1Primenumber {

	public static void main(String[] args) 
	
	{
		
		prime obj = new prime();
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = value.nextInt();
		obj.primenumber(num);

	}

}
