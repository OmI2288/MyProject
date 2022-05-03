package firstProject;

public class IfElseLadder {

	public static void main(String[] args) {
// IF ELSE LADDER
		int a = 35;
		
		if (a >= 75 && a <= 100)
		{
			System.out.println("Pass With 'A' Grade");
		}
		else if (a >50 && a < 75)
		{
			System.out.println("Pass With 'B' Grade");
		}
		else if (a >= 35 && a <50)
		{
			System.out.println("Pass With 'C' Grade");
		}
		else 
		{
			System.out.println("Fail");
		}
	}
}
