package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salarioFixo, totalVendas, total;
		
		nome = sc.nextLine();
		salarioFixo = sc.nextDouble();
		totalVendas = sc.nextDouble();
		
		total = salarioFixo + totalVendas*0.15;
		
		System.out.printf("TOTAL = R$ %.2f", total);
		System.out.println();
		
		sc.close();

	}

}
