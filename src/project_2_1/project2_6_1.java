package project_2_1;
import java.util.Scanner;

public class project2_6_1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		double celisius = 5.0/9*(fahrenheit - 32);
		System.out.println( " celisius is " + celisius);
		
	}

}
