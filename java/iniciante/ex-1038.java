package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] preco = {4.00, 4.50, 5.00, 2.00, 1.50};
		int a, b;	
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		double total;
		
		total = preco[a-1]*b;
		
		System.out.printf("Total: R$ %.2f", total);
		System.out.println();
		sc.close();

	}

}
