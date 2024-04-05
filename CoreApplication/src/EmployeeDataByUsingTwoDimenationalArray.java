
public class EmployeeDataByUsingTwoDimenationalArray {

	public static void main(String[] args) {
		String empdata[][]=new String[4][4];
		//emp1 record
		empdata[0][0]="101";
		empdata[0][1]="raju";
		empdata[0][2]="hyderabad";
		empdata[0][3]="23000";

		System.out.println(empdata[0][0]+"\t\t"+empdata[0][1]+"\t\t"+empdata[0][2]+"\t\t"+empdata[0][3]);


		//emp2 record
		empdata[1][0]="123";
		empdata[1][1]="keerthi";
		empdata[1][2]="hyderabad";
		empdata[1][3]="24000";

		System.out.println(empdata[1][0]+"\t\t"+empdata[1][1]+"\t\t"+empdata[1][2]+"\t\t"+empdata[1][3]);


		//emp3 record
		empdata[2][0]="432";
		empdata[2][1]="ganesh";
		empdata[2][2]="secendrabad";
		empdata[2][3]="21000";

		System.out.println(empdata[2][0]+"\t\t"+empdata[2][1]+"\t\t"+empdata[2][2]+"\t\t"+empdata[2][3]);

		//emp4 record
		empdata[3][0]="345";
		empdata[3][1]="kalpana";
		empdata[3][2]="karimnagar";
		empdata[3][3]="31000";

		System.out.println(empdata[3][0]+"\t\t"+empdata[3][1]+"\t\t"+empdata[3][2]+"\t\t"+empdata[3][3]);

		//emp5 record
//		empdata[4][0]="345";
//		empdata[4][1]="kalpana";
//		empdata[4][2]="karimnagar";
//		empdata[4][3]="31000";


	}

}
