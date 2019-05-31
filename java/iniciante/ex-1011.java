package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r, volume;
		
		r = sc.nextDouble();
		
		volume = (4/3.0)*3.14159*(Math.pow(r, 3));
		
		System.out.printf("VOLUME = %.3f", volume);
		System.out.println();
		
		sc.close();

	}

}
