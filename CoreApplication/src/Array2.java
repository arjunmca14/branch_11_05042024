
public class Array2 {

	public static void main(String[] args) {
		String names[]= {"raju","geetha","gopi","santhosh","ganesh","janshi"};
		
		for (int i = 0; i < names.length; i++) {
			if(names[i].charAt(0)=='g')
			{
				System.out.println(names[i]);
			}
		}
	}
}
