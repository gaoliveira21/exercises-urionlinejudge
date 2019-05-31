package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, triangle, circle, trapeze, square, rect;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		triangle = (a*c)/2;
		circle = 3.14159*(Math.pow(c, 2));
		trapeze = ((a+b)*c)/2;
		square = Math.pow(b, 2);
		rect = a*b;
		
		System.out.printf("TRIANGULO: %.3f", triangle);
		System.out.println();
		System.out.printf("CIRCULO: %.3f", circle);
		System.out.println();
		System.out.printf("TRAPEZIO: %.3f", trapeze);
		System.out.println();
		System.out.printf("QUADRADO: %.3f", square);
		System.out.println();
		System.out.printf("RETANGULO: %.3f", rect);
		System.out.println();
		
		sc.close();

	}

}
