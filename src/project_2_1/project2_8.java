package project_2_1;
import java.util.Scanner;

public class project2_8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter annual Interest Rate: ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate/1200;
		System.out.println("Enter years Interest Rate: ");
		int numberOfYears = input.nextInt();
		
		double loanAmount = input.nextDouble();
		double monthlyPayment=loanAmount * monthlyInterestRate/(1-
							1/Math.pow(1+monthlyInterestRate, numberOfYears*12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.println("The monthly payment is $ "+
				(int)(monthlyPayment*100)/100.0);
		System.out.println("The total payment is $ "+
				(int)(totalPayment * 100)/100.0);
	}
  //是怎样使其保留两位小数的？
}
