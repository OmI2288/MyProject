package allConcepts;

public class StringDemo {
	
	public static void main (String [] args ) {
		
		String a = "OmI";
		String aa = "OmI" ;
		String b = new String ("OmI") ;
		
		if (a ==  b )
		{
			System.out.println("Both are the same");
		}
		else {
			System.out.println("Both are not same ");
		}
		
		boolean r =  (a == aa );
		System.out.println(r);
		
		
		
		
	}
	
}
