import java.util.Scanner;


public class uri1003 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int A, B, soma;

		A = in.nextInt();
		B = in.nextInt();

		soma = A + B;

		System.out.println("SOMA = " + soma);

		in.close();
	}
}
