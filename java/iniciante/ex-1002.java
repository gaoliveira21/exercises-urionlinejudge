package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A;
		
		R = sc.nextDouble();
		
		A = 3.14159 * R * R;
		
		System.out.printf("A=%.4f",A);
		System.out.println();
		
		sc.close();

	}

}
