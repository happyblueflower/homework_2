package project_2_1;

public class project2_7 {
	public static void main(String[] args) {
		//��ȡ�ܺ�����
		long totalMilliseconds = System.currentTimeMillis();
		//��ȡ�������Լ���ǰ����
		long totalSeconds = totalMilliseconds / 1000;
		long nowSeconds = totalSeconds % 60;
		//������
		long totalMinutes = totalSeconds / 60;
		long nowMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		long nowHours = totalHours % 24;
		
		System.out.println("��ǰ��������ʱ��Ϊ "+ nowHours + " : " + nowMinutes + " : " + nowSeconds);
		
//		Ϊʲô�������������ʵ�ּ�0		
//		if(nowHours/10 == 0)
//		{
//			System.out.println("��ǰ��������ʱ��Ϊ "+"0"+ nowHours + " : " + nowMinutes + " : " + nowSeconds);
//			 if(nowMinutes/10 == 0)
//			{
//				 System.out.println("��ǰ��������ʱ��Ϊ "+ nowHours + " : " +"0"+ nowMinutes + " : " + nowSeconds);
//				 if(nowSeconds/10 == 0) {
//					 System.out.println("��ǰ��������ʱ��Ϊ "+ nowHours + " : " + nowMinutes + " : " +"0" +nowSeconds);
//				 }
//			}
//		}
//		
//	}
	}
}
