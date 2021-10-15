package project_2_1;
import java.util.Scanner;

public class project_2_3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		double average = (number1 + number2 + number3) / 3;
		System.out.print("The average of the three number is " + average);
	}

}
//input 为什么会出现警告