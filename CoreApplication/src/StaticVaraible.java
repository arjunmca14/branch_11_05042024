
public class StaticVaraible {
	static String name="raju"; //static varaible 
	
	public void method1()
	{
		System.out.println("name>>>"+name);
		//OR
		StaticVaraible s=new StaticVaraible();
		System.out.println("name>>>"+s.name);
		
		//OR
		System.out.println("name>>>"+StaticVaraible.name);
	}

	public static void method2()
	{
		System.out.println("name>>>"+name);
		//OR
		StaticVaraible s=new StaticVaraible();
		System.out.println("name>>>"+s.name);
		
		//OR
		System.out.println("name>>>"+StaticVaraible.name);
	}
}
