package LogicalProgram;

public class ArrayAscendingDescending {
	public static void main(String[] args) {
		int[] a = { 1, 3, 6, 4, 5, 3 };

		int l = a.length;
		int temp = 0;
 
	// For Ascending array 	
			
		for (int i = 0; i <= l - 1; i++) {
			for (int j = i + 1; j <= l - 1; j++) {
				if (a[i] > a[j]) {				// important condition For ascending array
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					}
				}	
			}
		System.out.println("Array In Ascending Order = ");
			for (int i = 0; i <= l - 1; i++) {
				System.out.print(+a[i] + " ");
			}
			System.out.println();
			
//	For Descending array 
		  
			int b [] =  {10,30,100,20} ;
			int t = 0 ;
			for ( int  i = 0 ; i <= b.length-1 ; i++ )
			{
				for (int j = i+1 ; j<=b.length-1 ; j++  )
				{
					if (b[i] < b[j])    //  same code But this condition changes 
					{
						t = b[i] ;
						b[i] = b[j] ;
						b[j] = t ;
					}
				}
			}
			
			
			System.out.println("Array 'b' In Descending Order");
			
			for(int i = 0 ; i<=b.length-1 ; i++)
			{
				System.out.print(b[i] + " ");
			}
			
		System.out.println();	
			
		}

	}

