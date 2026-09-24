package AugustDay1HW;

//Accept three numbers from the keyboard and print the sum and average of them

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		
	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number");
        int num1 = sc.nextInt();

        System.out.print("Enter second number");
        int num2 = sc.nextInt();

        System.out.print("Enter third number");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;

        double average = sum / 3.0;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        sc.close();

	}

}
