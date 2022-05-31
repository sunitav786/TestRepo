package work;

public class Lambda {
	
	public static void main(String[] args) {
		
		System.out.println("My System Starts...");
		
//		/*
//		 * MyInter myInter= new MyInterImpl(); myInter.sayHello();
//		 */
//	
//		MyInter i = new MyInter() {
//			
//			@Override
//			public void sayHello() {
//				System.out.println("this is first anonymous class");
//				
//			}
//		};
//		i.sayHello();
//		
//		MyInter i2 =new MyInter() {
//			
//			@Override
//			public void sayHello() {
//			System.out.println("this is second anonymous class");
//				
//			}
//		};
//		i2.sayHello();
		
		//using our interface with the help of lambda
		//first type
		
		  MyInter i=()-> {
			  System.out.println("this is first time i am using lambda");  
		  };
		  i.sayHello();
		  
		  //second type
		  
		 MyInter i2=()-> System.out.println("this is second time i am using lambda");
		  i2.sayHello();
		  
//		  SumInter sumInter = (int a, int b)->{
//			  return a+b;
//		  };
		  
		  SumInter sumInter = (a, b)-> a+b;
		  
		  
		 System.out.println(sumInter.sum(30, 40));
		 System.out.println(sumInter.sum(20, 10));
		  
		 
		 LengthInter lengthInter = (str ->str.length());
		System.out.println(lengthInter.getLength("Sunita Vishwakarma"));
	}

}
