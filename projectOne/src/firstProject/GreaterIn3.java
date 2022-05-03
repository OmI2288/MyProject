package firstProject;

public class GreaterIn3 {
	public static void main(String[] args) {

		// NESTED IF - CONDITIONAL STATEMENT

		int a = 30;
		int b = 40;
		int c = 50;

		if (a > b) {
			if (a > c) {
				System.out.println("a is GREATER");
			} else {
				System.out.println("c is GREATER");
			}
		} else {
			if (b > a) {
				System.out.println(" b is Greater");
			} else {
				System.out.println("c is greater");
			}

		}

	}
}
