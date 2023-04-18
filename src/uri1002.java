import java.util.Locale;
import java.util.Scanner;


public class uri1002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in= new Scanner(System.in);
		
		double R, A, pi = 3.14159;
	    
	    R = in.nextDouble();

	    A = pi * R * R;

	    System.out.printf("A=%.4f%n", A);

		in.close();
	}
}
