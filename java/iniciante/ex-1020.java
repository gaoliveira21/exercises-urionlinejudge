package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, years, months, days;
		
		n = sc.nextInt();
		
		years = n/365;
		n = n%365;
		
		months = n/30;
		days = n%30;
		
		
		System.out.printf(years + " ano(s)");
		System.out.println();
		System.out.printf(months + " mes(es)");
		System.out.println();
		System.out.printf(days + " dia(s)");
		System.out.println();
		
		sc.close();

	}

}
