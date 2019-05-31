package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a,b,c, delta = 0, x1, x2;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if(a == 0) {
			System.out.printf("Impossivel calcular");
		} else {
			delta = Math.pow(b, 2) - (4*a*c);
			
			if(delta >= 0) {
				x1 = (-b + Math.sqrt(delta))/(2*a);
				x2 = (-b - Math.sqrt(delta))/(2*a);
				
				System.out.printf("R1 = %.5f", x1);
				System.out.println();
				System.out.printf("R2 = %.5f", x2);
			} else {
				System.out.printf("Impossivel calcular");
			}
			
		}
		
		System.out.println();
		sc.close();

	}

}
