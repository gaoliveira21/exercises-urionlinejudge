package application;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double[] bankNote = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00};
		
		n = sc.nextInt();
		
		System.out.println(n);
		
		//formatação para real(R$)
		Locale l = new Locale("pt","BR");
		NumberFormat nf =  NumberFormat.getCurrencyInstance(l);
		
		for (int i = 0; i < bankNote.length; i++) {
			System.out.printf(n/(int)bankNote[i] + " nota(s) de " + nf.format(bankNote[i]));
			System.out.println();
			n = n%(int)bankNote[i];
		}
		
		sc.close();

	}

}
