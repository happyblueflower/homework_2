package project_2_1;
import java.util.Scanner;

public class project2_6 {
	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter an integer for seconds:");
		int seconds = input.nextInt();
		int minutes = seconds / 60;
		int reminingSeconds = seconds % 60;
		System.out.println( seconds + " seconds is " + minutes +
				" minutes and "+ reminingSeconds + " seconds");
		
	}

}
