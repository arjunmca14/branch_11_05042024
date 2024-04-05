
public class OutSideClass {
	
	public void method1()
	{
		InstanceVariable i=new InstanceVariable();
		System.out.println("name>>>"+i.name);
		
		StaticVaraible s=new StaticVaraible();
		System.out.println("name>>>"+s.name);
		
		//OR
		System.out.println("name>>>"+StaticVaraible.name);
	}
	
	public void method2()
	{
		InstanceVariable i=new InstanceVariable();
		System.out.println("name>>>"+i.name);
		
		StaticVaraible s=new StaticVaraible();
		System.out.println("name>>>"+s.name);
		
		//OR
		System.out.println("name>>>"+StaticVaraible.name);
	}

}
