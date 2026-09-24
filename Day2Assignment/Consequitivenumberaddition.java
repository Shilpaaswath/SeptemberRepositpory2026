
/*Write a program which inputs a positive natural number N and prints the possible 
consecutive numbercombinations, which when added give N.*/


package Day2Assignement;

import java.util.Scanner;

public class Consequitivenumberaddition {

	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the positive natural number");
		int n = value.nextInt();
		boolean set = false;
	
		
		for (int i=1;i<n;i++)
		{
			if (i +(i+1)==n)
			{
				int index1 = i;
				int index2 = i+1;
				System.out.println(index1 + "," +index2);
				set = true;
				
				
			}if (i +(i+1)+(i+2)==n)
			{
				int index3 = i;
				int index4 = i+1;
				int index5 = i+2;
				System.out.println(index3+ "," +index4+ "," +index5);
				set = true;
			}
			
		
			
		}
		if (set == false)
		{
			System.out.println("No consequitive number");
		}
		

	}

}
