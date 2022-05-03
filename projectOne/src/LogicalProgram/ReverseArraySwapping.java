package LogicalProgram;

public class ReverseArraySwapping {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };
		int length = a.length;
		int temp ;
		System.out.println(length);

		for (int i = 0; i <= length - 1; i++) {
			temp = a[i];
			a[i] = a[length - 1];
			a[length-1] = temp;
			length -- ;
		}
		System.out.println("Reverse array");
		for (int i = 0 ; i<= a.length-1 ; i++)
		{
			System.out.print(" "+a[i]);
		}
		
	
	}

}
