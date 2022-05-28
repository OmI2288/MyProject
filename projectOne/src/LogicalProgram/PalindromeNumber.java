package LogicalProgram;

public class PalindromeNumber {
			 
	public static void main(String[] args) {
		
		int num = 3953 ;
		int temp =  num ; 
		
		int rem ;
		int rev = 0 ; 
		
		while (num > 0 ) 		// " != " also can be used  
		{    
			
			rem = num % 10 ; // 3  , 5 , 
			num = num /10 ;  // 355 , 35 ,
			rev = rem + (rev * 10); // 3 , 35 , 
		}
		if (temp == rev )
		{
			System.out.println ("number is palindrome");
		}
		else
		{
			System.out.println ("Numer is not palindrome ");
		}
		
		
	}
	
	
	
	
	
	
}
