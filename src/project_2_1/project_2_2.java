package project_2_1;
import java.util.Scanner;//����Scanner��

public class project_2_2{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius: ");
		
		double radius = input.nextDouble();//�����Ӽ��̶���һ��ֵ
		double area = radius * radius * 3.14159;
		
		System.out.println("The area for the circle of radius " + radius +
				" is " + area);
	}

}
// Դ�������ַ����������ܿ���
