
public class Instance_Static {
	
	public static void main(String[] args) {
		Student.collegename="ANURAG";
		
		Student std1=new Student();
		std1.stdid=101;
		std1.stdname="raju";
		std1.stdaddress="hyderabad";
//		std1.collegename="JNTU";
		
		System.out.println(std1.stdid+":::"+std1.stdname+":::"+std1.stdaddress+"::"+std1.collegename);
		
		
		Student std2=new Student();
		std2.stdid=123;
		std2.stdname="ramesh";
		std2.stdaddress="karimnagar";
//		std2.collegename="JNTU";
		
		System.out.println(std2.stdid+":::"+std2.stdname+":::"+std2.stdaddress+"::"+std2.collegename);
		
		
		Student std3=new Student();
		std3.stdid=141;
		std3.stdname="karunakar";
		std3.stdaddress="goa";
//		std3.collegename="JNTU";
		
		System.out.println(std3.stdid+":::"+std3.stdname+":::"+std3.stdaddress+"::"+std3.collegename);
	}

}
