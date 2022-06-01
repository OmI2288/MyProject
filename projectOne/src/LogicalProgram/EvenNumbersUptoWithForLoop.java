package LogicalProgram;

public class EvenNumbersUptoWithForLoop {
	public static void main(String[] args) {

		System.out.print("Even numbers Upto 20 Are = ");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

	}
}