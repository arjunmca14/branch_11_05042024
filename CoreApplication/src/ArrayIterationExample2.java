
public class ArrayIterationExample2 {
	public static void main(String[] args) {
		
		int arr[]= {6,3,1,7,9,32,23,78,56,35,89,9};
		System.out.println(sumCal(arr));
		
		int arr1[]={4,3,5,7,8};
		System.out.println(sumCal(arr1));
		
		int arr2[]={4,3,5,7,8,5,67};
		System.out.println(sumCal(arr2));
	}
	
	
	public static int  sumCal(int arr[])
	{
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		
		return sum ;
	}

}
