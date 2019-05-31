package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float a, b, c, resultado = 0;
		
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		if(Math.abs(b-c) < a && a < b+c || Math.abs(a-c) < b && b < a+c || Math.abs(a-b) < c && c < a+b){
			resultado = a + b + c;
			System.out.printf("Perimetro = %.1f\n", resultado);
		} else {
			resultado = ((a+b)*c)/2;
			System.out.printf("Area = %.1f\n", resultado);
		}
		
		sc.close();

	}

}
