package LogicalProgram;

public class ArrayCopytoAnotherArray {

	public void main(String[] args) {
		
		//Copy one array to another array 
		int a[] =  new int[] {1,2,3,4,5,6};
		int l = a.length;
		
		int b[] =  new int[l] ;
		
		// Copy all elements of array into another array 
		for (int i = 0 ; i<=l-1 ; i++)
		{
		     a[i] =b[i] ;
		}
		
		// print original array 
		System.out.println("Elements Of Original Array");
		for(int i= 0 ; i<=l-1 ; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		//print another array 
		System.out.println("Elements Of New Array");
		for (int i= 0 ; i<= l-1 ; i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
