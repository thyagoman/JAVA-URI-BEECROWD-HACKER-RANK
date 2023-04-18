import java.util.Locale;
import java.util.Scanner;


public class uri1004 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		int x, y, prod;
		
		x = in.nextInt();
		y = in.nextInt();
		
		prod = x*y;
		
		System.out.println("PROD = " + prod);
		
		in.close();
	}
}
