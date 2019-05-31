package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, prod;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		prod = a * b;
		
		System.out.printf("PROD = " + prod);
		System.out.println();
		
		sc.close();

	}

}
