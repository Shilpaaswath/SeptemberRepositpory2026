//to print the area (r2) and perimeter(2 r) of a circle

package AugustDay1HW;

import java.util.Scanner;

public class AreaandPerimeter {

	public static void main(String[] args) {
		

        Scanner num = new Scanner(System.in);

        System.out.print("Enter radius and changed version for github: ");
        int r = num.nextInt();

        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        System.out.println("Area of circle = " + area);
        System.out.println("Perimeter of circle = " + perimeter);


	}

}
