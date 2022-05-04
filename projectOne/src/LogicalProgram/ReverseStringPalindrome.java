package LogicalProgram;

public class ReverseStringPalindrome {

	public static void main(String[] args) {

		String a = "MoM" ;
		
		int length =  a.length(); 
		System.out.println(length);
		
		char c = a.charAt(2);
		System.out.println(c);
		
		String rev = "" ;
		
		for (int i =length-1 ; i>=0 ; i--)
		{
			rev = rev + a.charAt(i); 
		}
			
		if (rev.equals(a))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
 		
		
	}

}
