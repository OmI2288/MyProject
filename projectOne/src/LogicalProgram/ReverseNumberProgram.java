package LogicalProgram;

public class ReverseNumberProgram {

	public static void main(String[] args) {

		int numb = 1234;
		
		int rem;
		int rev = 0;

		while (numb > 0) // 12334, 
		{
			rem = numb % 10;  // 4  ,3 , 2 ,1
			System.out.println(rem);
			numb = numb / 10; //123 ,12, 1 , 0
			System.out.println(numb);
			rev = rem + (rev * 10); // 4 ,43,432 ,4321  
			System.out.println(rev);
		}

		System.out.println("Reverse number is = " + rev);

	}

}
