package LogicalProgram;

public class ReverseNumber {
	
	public static void main(String[] args) 
	{
		// WAP TO FIND OUT NUMBER IS PALINDROME OR NOT 
		// reverse any number in Java   
		
		int num = 123 ;
		int temp = num ;
		int rem  ;
		int rev = 0 ;
		
		
		while (num >0)
		{
			rem = num % 10 ; // 3  2 
			num = num / 10 ; // 12  1 
			rev = rem + ( rev*10) ; //3 2  1
		}
		System.out.println("reverse number is = " + rev) ;
		
		if ( rev == temp )
		{
			System.out.println("Number Is Palindrome");
		}
		else 
		{
			System.out.println("Number is Not Palindrome");
		}
	
	}
	
	
	
	
	
	
	
}
