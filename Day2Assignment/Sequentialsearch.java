//search an element in the array of integersusing sequential search

package Day2Assignement;

import java.util.Scanner;

public class Sequentialsearch {

	public static void main(String[] args) 
	{
	
		int a[]= { 25,75,65,80};
	   boolean found = false;
	   int index = 0;
	    
	    Scanner number = new Scanner(System.in);
	    System.out.println("Enter number to be found from the array listed");
	    int num = number.nextInt();
	    
	    for(int i=0;i<a.length;i++)
	    {
	    
	    	if (a[i] == num)
	    	{
	    	    found = true;
	    	    index = i;
	    	    break;
	    	}
	    			
	    }
	    
	    if (found)
	    {
	    	System.out.println("The number enter is found in array at " + index +"position");
	    }
	    {
	    	System.out.println("The number enter is not found in array");
	    }
		

	}

}
