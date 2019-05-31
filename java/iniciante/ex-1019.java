package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, minutes, hours;
		
		n = sc.nextInt();
		minutes = n/60;
		
		n = n%60;
		
		hours = minutes/60;
		minutes = minutes%60;
		
		System.out.printf(hours + ":" + minutes + ":" + n);
		System.out.println();
		
		sc.close();

	}

}
