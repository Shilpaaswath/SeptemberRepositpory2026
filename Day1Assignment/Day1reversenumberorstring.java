//WAP to reverse a digits or string 

package AugustDay1HW;

import java.util.Scanner;


public class Day1reversenumberorstring {

	public static void main(String[] args) {
	
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		String name = value.next();
		System.out.println("Enter the Digits to be reversed");
		String digit = value.next();
		
	    //sSystem.out.println(name);
	    
	    String reversename = "";
	    String reversedigit = "";
	    
	    
	    // loop for reversename
	    for (int i=(name.length()-1);i>=0;i--)
	    {
	    
	    reversename = reversename + name.charAt(i);
	  
	    }
	    System.out.println(reversename);
	    
	    //loop for reversestring
	    
	    //loop for reversedigits
	    
	    for (int j= (digit.length()-1);j>=0;j--)
	    {
	    
	    	reversedigit = reversedigit + digit.charAt(j);
	  
	    }
	    System.out.println(reversedigit);
	    
	   

	}

}
