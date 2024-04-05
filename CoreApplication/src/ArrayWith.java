
public class ArrayWith {
	
	public static void main(String[] args) {
		String names[];
		
		names= new String[5];
		
		System.out.println(names);
		names[1]="janshi";
		names[3]="raju";
		
		char []arr=names[1].toCharArray();
		for(char c:arr)
		{
			System.out.println(c);
		}
		
		char []arr1;
		arr1=new char[names[1].length()];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=names[1].charAt(i);
		}
		
		
		arr1[3]='g';
		System.out.println("================");
		for(char c:arr1)
		{
			System.out.println(c);
		}
		
		
	}

}
