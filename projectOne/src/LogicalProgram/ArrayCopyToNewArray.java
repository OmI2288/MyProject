package LogicalProgram;

public class ArrayCopyToNewArray {
	public static void main(String[] args) {
		//Copy one array to another array 
		int a[] =   {1,2,3,4,5,6};
		int l = a.length;
		
		int b[] =  new int[l] ;
		
		// Copy all elements of array into another array 
		for (int i = 0 ; i<=l-1 ; i++)
		{
		     b[i] =a[i] ;
		}
		
		// print original array 
		System.out.println("Elements Of Original Array");
		for(int i= 0 ; i<=l-1 ; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		//print another array 
		System.out.println("Elements Of New Array b");
		for (int i= 0 ; i<= l-1 ; i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	}

