package project_2_1;
import java.util.Scanner;//引入Scanner类

public class project_2_2{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius: ");
		
		double radius = input.nextDouble();//该语句从键盘读入一个值
		double area = radius * radius * 3.14159;
		
		System.out.println("The area for the circle of radius " + radius +
				" is " + area);
	}

}
// 源代码中字符串常量不能跨行
