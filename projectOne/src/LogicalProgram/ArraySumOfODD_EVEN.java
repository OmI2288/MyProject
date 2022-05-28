package LogicalProgram;

public class ArraySumOfODD_EVEN {
	
	public static void main(String[] args ) {
		
		// SUM OF ODD AND EVEN NUMBERS OF ARRAY 
		int ar [] =  {1,2,3,4,5,6,7};
		int l = ar.length;
		System.out.println("Length of array = " +l);
		
		int oddSum = 0 ;
		int evenSum = 0 ; 
		
		for (int i  =  0 ;  i<= l-1 ; i++ )
		{
			if (ar[i] % 2 == 0)
			{
				evenSum = evenSum + ar[i];
			}
			else
			{
				oddSum = oddSum + ar[i];
			}
		}
		System.out.println("Sum of ODD number is = " +oddSum);
		System.out.println("Sum of EVEN number is = " + evenSum );

	}
	

}
