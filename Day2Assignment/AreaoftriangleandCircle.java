//find the area of a triangle and circle using Method Overloading
//Function Area is used with different parameters are assigned

package Day2Assignement;

public class AreaoftriangleandCircle {
	
	
	static void Area(double r)
	{
		double Area = Math.PI * r*r;
		System.out.println("The Area of Circle is : " +Area);
		
	}
	
	static void Area(int b,int h)
	{
		double Area = 0.5*(b*h);
		System.out.println("The Area of Triangle is : " +Area);
	}

	public static void main(String[] args)
	
	{
		Area(5.6);
		
		Area(5 , 6);	

	}

}
