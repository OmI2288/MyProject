package LogicalProgram;

public class EvenNumbersUpto20 {
	public static void main(String[] args) {

		// With While LOOP
		int i = 1;
		while (i <= 20) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println();
	
		
		// Do While Loop
		do {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		} while (i <= 20);

	}
}
