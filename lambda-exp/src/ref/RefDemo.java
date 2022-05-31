package ref;

public class RefDemo {
	public static void main(String[] args) {
		System.out.println("learning methods refrences....");
		
		//provide the implementation of workInter
		
//		WorkInter workInter = ()-> {
//			System.out.println("this is do task new method");
//		};
//		
//		workInter.doTask();
		
		//refer to the method
		//static method ko refer kiya 
		//className::methodName 
		WorkInter workInter2 = Stuff::dostuff;
		workInter2.doTask();
		
		Runnable runnable =Stuff::threadTask;
		Thread d = new  Thread(runnable);
		d.start();
	}

}
