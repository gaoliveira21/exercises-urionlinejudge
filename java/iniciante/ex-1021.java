package application;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n;
		double[] bankNote = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
		double[] coins = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
		int calc = 0;
		
		n = sc.nextDouble();
		
		System.out.println(n);
		
		Locale l = new Locale("pt","BR");
		NumberFormat nf =  NumberFormat.getCurrencyInstance(l);
		
		System.out.println("NOTAS:");
		for (int i = 0; i < bankNote.length; i++) {
			System.out.printf((int)n/(int)bankNote[i] + " nota(s) de " + nf.format(bankNote[i]));
			System.out.println();
			n = n%(int)bankNote[i];
		}
		
		System.out.println("MOEDAS:");
		
		for (int i = 0; i < coins.length; i++) {
			calc = (int)(n/coins[i]);
			System.out.printf(calc + " moeda(s) de " + nf.format(coins[i]));
			System.out.println();
			n = n%coins[i];
		}
		
		sc.close();

	}

}
