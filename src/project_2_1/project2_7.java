package project_2_1;

public class project2_7 {
	public static void main(String[] args) {
		//获取总毫秒数
		long totalMilliseconds = System.currentTimeMillis();
		//获取总秒数以及当前秒数
		long totalSeconds = totalMilliseconds / 1000;
		long nowSeconds = totalSeconds % 60;
		//分钟数
		long totalMinutes = totalSeconds / 60;
		long nowMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		long nowHours = totalHours % 24;
		
		System.out.println("当前格林尼治时间为 "+ nowHours + " : " + nowMinutes + " : " + nowSeconds);
		
//		为什么用这个方法不能实现加0		
//		if(nowHours/10 == 0)
//		{
//			System.out.println("当前格林尼治时间为 "+"0"+ nowHours + " : " + nowMinutes + " : " + nowSeconds);
//			 if(nowMinutes/10 == 0)
//			{
//				 System.out.println("当前格林尼治时间为 "+ nowHours + " : " +"0"+ nowMinutes + " : " + nowSeconds);
//				 if(nowSeconds/10 == 0) {
//					 System.out.println("当前格林尼治时间为 "+ nowHours + " : " + nowMinutes + " : " +"0" +nowSeconds);
//				 }
//			}
//		}
//		
//	}
	}
}
