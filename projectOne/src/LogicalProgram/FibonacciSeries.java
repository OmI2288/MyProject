package LogicalProgram;

public class FibonacciSeries {
	 public static void main(String[] args) {
		
		 int first =  0 ; 
		 int second =  1 ;
		 
		 System.out.println("Fibonacci series upto 10 is = " + first + " ,");
		 for (int i = 1 ; i <= 10 ;  i++ )
		 {	
			 System.out.print(first + " , ");
			
			 int nextterm =  first + second ;
			 first = second ;
			 second = nextterm ;
			// System.out.print(first + " , ");  // never write here 
		 }
		 
		 
		 
		 
	}
}
