package LogicalProgram;

public class ArmstrongNumber {
	public static void main(String[] args) {

		int num = 153;  // 370 ,
		int temp = num;

		int r;
		int sum = 0;

		while (num > 0) // {  !=  } condition can be used 
		{
			r = num % 10;
			num = num / 10;
			sum = sum + (r * r * r);
		}
		if (temp == sum) {
			System.out.println("Number Is ArmStrong");
		}
		else {
			System.out.println("Number iS Not Armstrong");
		}
	}

}
