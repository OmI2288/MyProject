package loopingProgram;

public class Square {

	static int i;
	static int j;
	static int k ;
	static int l ;
	static int	row =  5 ;
	public static void main(String[] args) {
		
		int	row =  5 ;
		
		for (i = 0; i <= 5; i++) {
			System.out.println("*");
		}

		for (i = 0; i < +5; i++) {
			for (j = 0; j < +5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (i = 0; i <= 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		for (i = 4; i >= 0; i--) {
//			for (j = 4; j <= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for (i = 4; i >= 0; i--) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");			// pRACTICE 
			}
			System.out.println("");
		}
		
		for ( i=0 ; i <= row ; i++)
		{
			for( j = 1; j <= i ; j++)
			{
				System.out.print(" ");
			}
			for ( k = row ; k >=i ; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			for ( i = 0; i <= row  ; i++  )
			{
				for (j= row-1 ; j >= i ; j-- )
				{
					System.out.print(" ");
				}
				for ( k = 0 ;k <= i  ; k ++ )
				{
					System.out.print("*");
				}
				System.out.println();
			}
		

	}

}
