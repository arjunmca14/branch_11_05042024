
public class EmployeeDataExample {
	
	public static void main(String[] args) {
		Employee empdata[]=new Employee[4];
//		System.out.println(empdata);
		
		Employee emp=new Employee();
		emp.id=101;
		emp.name="raju";
		emp.address="hyderabad";
		emp.salary=23000;
		
		empdata[0]=emp;
		
		System.out.println(empdata[0].id+"\t\t"+empdata[0].name+"\t\t"+empdata[0].address+"\t\t"+empdata[0].salary);
		
		//OR
		empdata[1]=new Employee(); //Object assignemnt
		empdata[1].id=123;   //==>
		empdata[1].name="keerthi";
		empdata[1].address="hyderabad";
		empdata[1].salary=24000;
		System.out.println(empdata[1].id+"\t\t"+empdata[1].name+"\t\t"+empdata[1].address+"\t\t"+empdata[1].salary);
		
		
		empdata[2]=new Employee();
		empdata[2].id=432;   //==>
		empdata[2].name="ganesh";
		empdata[2].address="secendrabad";
		empdata[2].salary=21000;
		System.out.println(empdata[2].id+"\t\t"+empdata[2].name+"\t\t"+empdata[2].address+"\t\t"+empdata[2].salary);

		empdata[3]=new Employee();
		empdata[3].id=432;   //==>
		empdata[3].name="ganesh";
		empdata[3].address="secendrabad";
		empdata[3].salary=21000;
		System.out.println(empdata[3].id+"\t\t"+empdata[3].name+"\t\t"+empdata[3].address+"\t\t"+empdata[3].salary);
		
		
	}

}
