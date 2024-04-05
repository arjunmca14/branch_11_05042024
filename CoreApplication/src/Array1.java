
public class Array1 {
	public static void main(String[] args) {
		int arr[]= {4,6,8,2,6,3,5,8,9,12,34,36,67,34};
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
