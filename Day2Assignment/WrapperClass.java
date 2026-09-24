package Day2Assignement;

import Practiceproject.Evenandodd;

//import Practiceproject.Evenandodd;

public class WrapperClass extends Evenandodd

{

	public static void main(String[] args) {
		
		//convert string to int
		
		String name = "1234";
		int b = Integer.parseInt(name);
		System.out.println("The string value is converted in int: " +b);
		
		//convert int to Integer
		
		int x= 10;
		
		Integer Y = x;
		System.out.println(Y.floatValue());
		
		//convert Integer to float
		
		Integer a=12;
		System.out.println("The Integer value is converted to float: " +a.floatValue());
		
		//convert int to string
		
		int c = 13;
		Integer d = c;
		System.out.println("The Integer value is converted to string: " +d.toString());
		
	
				

	}
	
	public  void add1()
	{
		WrapperClass num1 = new WrapperClass();
		//Evenandodd num1 = new Evenandodd();
		num1.add(0, 0);
	
		//num1.multyply();
		//num1.add(0, 0);
		//Evenandodd.multyply();
		//WrapperClass.add(0, 0);
		//Evenandodd.add(0, 0);
		//add(1,2);
		
	
	}

}
