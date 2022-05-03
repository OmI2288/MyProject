package LogicalProgram;

public class ReverseString {

	public static void main(String[] args) {
		String a = "Himanshu"; // declaration first way
		String ab = new String("Himanshu"); // declaration second way

		int length = a.length();
		System.out.println(length);

		// Take the temp String null;
		String rev = "";

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}
		System.out.println(rev);
	}

}
