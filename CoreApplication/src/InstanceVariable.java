
public class InstanceVariable {
	String name="raju";  //non-static variable/instance varaible
	
	public void method1()
	{
		System.out.println("name>>>"+name);
		//OR 
		InstanceVariable i=new InstanceVariable();
		System.out.println("name>>>"+i.name);
		
	}
	
	public static void method2()
	{
//		System.out.println("name>>>"+name); //compile time error
		//OR 
		InstanceVariable i=new InstanceVariable();
		System.out.println("name>>>"+i.name);
	}

	
//	public static void main(String[] args) {
//		InstanceVariable i=new InstanceVariable();
//		i.method1();
//		i.method2();
//	}
}
