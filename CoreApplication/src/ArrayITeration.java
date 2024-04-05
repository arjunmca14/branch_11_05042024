
public class ArrayITeration {

	public static void main(String[] args) {
		int arr[]= {6,3,1,7,9,32,23,78,56,35,89,9};
		
		//sum value 
//		int sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
//		System.out.println("sum value>>"+sum);
		
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum =sum+arr[i];
		}
		
		System.out.println("total>>"+sum);
		
	}
}

/*
sum=0
i=0
	i<lenght==>true
		sum=sum+arr[0]==>sum=0+6
		i++==>i=i+1==>i=0+1==>i=1
	
sum=6
i=1

	i<length==>true
		sum=sum+arr[1]==>sum=6+3
		i=1+1==>2
	
sum=9
i=2

*/