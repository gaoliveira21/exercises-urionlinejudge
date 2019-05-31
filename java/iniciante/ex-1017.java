package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int timeSpent, speed, distance;
		double fuel;
		
		timeSpent = sc.nextInt();
		speed = sc.nextInt();
		
		distance = timeSpent * speed;
		fuel = distance/12.0;
		
		System.out.printf("%.3f", fuel);
		System.out.println();
		
		sc.close();

	}

}
