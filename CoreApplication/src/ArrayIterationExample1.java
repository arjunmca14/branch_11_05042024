
public class ArrayIterationExample1 {

	public static void main(String[] args) {
		int arr[]= {6,3,1,7,9,32,23,78,56,35,89,9};
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum =sum+arr[i];
		}
		
		System.out.println("total>>"+sum);
	//==================================================
		int arr1[]={4,3,5,7,8};
		
		int sum1=0;
		for (int i = 0; i < arr1.length; i++) {
			sum1=sum1+arr1[i];
		}
		
		System.out.println("second client sum>>>"+sum1);
	}
}
