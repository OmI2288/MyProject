package allConcepts;

public class StringMethods {
		
	public static void main (String[]  args ) {
		
		String a = "Omprakash";
		String b = " omprakash   biro";
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toCharArray());
		System.out.println(a.toLowerCase());
		System.out.println(a.concat(" is a Quality Analyst having 10 LPA "));
		System.out.println(b.trim());
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase("omprakash"));
		System.out.println(a.indexOf('k'));
		System.out.println(a.indexOf('a'));
		System.out.println(a.lastIndexOf('a'));
		System.out.println(a.startsWith("O"));
		System.out.println(a.startsWith("Om"));
		System.out.println(a.endsWith("sh"));
		System.out.println(a.substring(2,6));
		System.out.println(a.replace('a','P' ));
		System.out.println(a.isEmpty());
		
	}
}
