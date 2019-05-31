package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a;
		
		a = sc.nextDouble();
		
		if(a >= 0 && a <= 25.0000) {
			System.out.printf("Intervalo [0,25]");
		} else if(a > 25.00001 && a <= 50.0000000){
			System.out.printf("Intervalo (25,50]");
		}else if(a > 50.00001 && a <= 75.0000000){
			System.out.printf("Intervalo (50,75]");
		}else if(a > 75.00001 && a <= 100.0000000) {
			System.out.printf("Intervalo (75,100]");
		}else {
			System.out.printf("Fora de intervalo");
		}
		
		System.out.println();
		sc.close();

	}

}
