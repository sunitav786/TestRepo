package ref;

import java.time.LocalDate;
import java.util.Iterator;

public class Stuff {
	
	public static void dostuff()
	{
		System.out.println("I am doing Task");
		
		LocalDate now = LocalDate.now();
		System.out.println(now.toString());
		
		
	}
	
	public static void threadTask()
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println(i*2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
