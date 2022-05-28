package LogicalProgram;

public class SummationUpto10 {
	public static void main(String[] args) {
		
	// Summation of numbers Upto 10;	
		int i =1, sum = 0;
		while(i<=10)
		{
			sum =sum+i;  //1,3,6,10,15,.....
			i++;
		}
		System.out.println("Summation = " +sum);

	// Condition is FALSE still printing One time bcz check the condition at last 	
		int x =1;
		do
		{
			System.out.println(x);
			x++;
			
		}while(x>10);
	}
}
