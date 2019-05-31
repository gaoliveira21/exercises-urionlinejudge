package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, media;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		media = ((a*2)+(b*3)+(c*5))/10;
		
		System.out.printf("MEDIA = %.1f", media);
		System.out.println();
		
		sc.close();

	}

}
