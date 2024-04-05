
public class MethodsTesting {

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
