import java.util.ArrayList;

public class CollectionExample {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(234);
		al.add("raju");
		al.add(true);
		
		System.out.println(al);
		System.out.println("size>>>"+al.size());
		
		al.add(345);
		al.add(1245);
		al.add(134);
		
		

		System.out.println(al);
		System.out.println("size>>>"+al.size());
		System.out.println("raju is there or not????"+al.contains("raju"));
		
	}
}
