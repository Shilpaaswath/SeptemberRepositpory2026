//to print the area(width*height) and perimeter(2*(width+height)) of a rectangle

package AugustDay1HW;

import java.util.Scanner;

public class RectangleAreaPerimeter {

	public static void main(String[] args) {
		

        Scanner num = new Scanner(System.in);

        System.out.print("Enter width");
        double width = num.nextDouble();

        System.out.print("Enter height");
        double height = num.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area of rectangle =" + area);
        System.out.println("Perimeter of rectangle =" + perimeter);

        num.close();

	}

}
