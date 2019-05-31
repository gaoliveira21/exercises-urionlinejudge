package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distance, time;
		
		distance = sc.nextInt();
		
		time = distance*2;
		
		System.out.printf(time + " minutos");
		System.out.println();
		
		sc.close();

	}

}
