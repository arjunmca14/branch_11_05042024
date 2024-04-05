
public class ArrayInitialization {
	public static void main(String[] args) {
		int arr[];//array declaration 
		
		arr=new int[5];
		
		System.out.println(arr);
		
		arr[2]=123;
		for(int a:arr)
		{
			System.out.println(a);
		}
	}

}
