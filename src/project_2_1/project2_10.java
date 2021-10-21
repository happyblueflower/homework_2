package project_2_1;
import java.util.Scanner;

public class project2_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount in double, for example 7.2...");
		double amount = input.nextDouble();
		int remainingAmount = (int)(amount * 100);//”√¿¥∏…¬Ô£ø
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount / 100;
		
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		int numberOfPennies = remainingAmount;
		
		System.out.println("your amount "+ amount+" consists of ");
		System.out.println(" "+ numberOfOneDollars+" dollars ");
		System.out.println(" "+ numberOfQuarters+" quaters");
		System.out.println(" " + numberOfDimes+" dimes ");
		System.out.println(" "+ numberOfNickels+" nickels");
		System.out.println(" "+ numberOfPennies+" pennies");
		
		
	}

}
