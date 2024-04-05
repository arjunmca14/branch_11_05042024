
public class TwoDimentaionArrayIteration {
	public static void main(String[] args) {
		String empdata[][]=new String[4][4];
		//emp1 record
		empdata[0][0]="101";
		empdata[0][1]="raju";
		empdata[0][2]="hyderabad";
		empdata[0][3]="23000";


		//emp2 record
		empdata[1][0]="123";
		empdata[1][1]="keerthi";
		empdata[1][2]="hyderabad";
		empdata[1][3]="24000";



		//emp3 record
		empdata[2][0]="432";
		empdata[2][1]="ganesh";
		empdata[2][2]="secendrabad";
		empdata[2][3]="21000";


		//emp4 record
		empdata[3][0]="345";
		empdata[3][1]="kalpana";
		empdata[3][2]="karimnagar";
		empdata[3][3]="31000";



		for(int i=0;i<empdata.length; i++)
		{
			for(int j=0;j<empdata.length;j++)
			{
				System.out.print(empdata[i][j]+"\t\t");
			}
			System.out.println(); //new line
		}
		
		/*
		 *  i=0
		 * 	 j=0 	
		 * 					empda[0][0]==>data
		 * 		j=1			empda[0][1]
		 * 		j=2			empdata[0][2]
		 * 		j=3		empdata[0][3]	
		 * 
		 *  new line
		 * i=1
		 * 	 j=0 	
		 * 					empda[1][0]==>data
		 * 		j=1			empda[1][1]
		 * 		j=2			empdata[1][2]
		 * 		j=3		empdata[1][3]	
		 *
		 * 
		 */
		
	}

}
	