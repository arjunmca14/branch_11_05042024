
public class MethodExample {
	
	
	void method1()
	{
			System.out.println("instance method =>because we are not used static keyword");
	}

	static void method2()
	{
		System.out.println("statuc method==>we are using static method");
	}

	public static void main(String[] args) {
		
		
		
		//while using the Object referal 
		MethodExample m=new MethodExample();
		m.method1();
		m.method2();
		
		//
//		MethodExample.method1();  //compile time error
		MethodExample.method2(); //static method 

	}
}
