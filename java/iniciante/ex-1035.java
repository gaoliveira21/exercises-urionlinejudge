package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		if(b > c && d > a && (c+d) > (a+b) && c > 0 && d > 0 && a%2 == 0) {
			System.out.print("Valores aceitos");
		} else {
			System.out.print("Valores nao aceitos");
		}
		
		System.out.println();
		
		sc.close();

	}

}
