package LogicalProgram;

public class ArrayPrintEvenANDOddNUmber {

	public static void main(String[] args) {

		// PROGRAM TO PRINT EVEN AND ODD NUMBER FROM AN ARRAY

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int l = a.length;
		System.out.println("Length of array is = " + l);

		for (int i = 0; i <= l - 1; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("Even numbers = " + a[i]);
			} else {
				System.out.println("Odd numbers = " + a[i]);
			}
		}
		
		//Second approach 
		
		System.out.println("Even numbers from array are -");
		for (int i = 0 ;i <=l-1 ; i++)
		{
			if (a[i] %2 == 0)
			{
				System.out.print(a[i] + " ");
			}
		}
		
		System.out.println(); // JUst done it for new line 
		
		System.out.println("ODD numbers from array are");
		for (int i = 0 ; i<=l-1 ; i++)
		{
			if (a[i] %2 != 0)
			{
				System.out.print(a[i] + " ");
			}
		}
	}
}
