package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] codPeca = new int[2];
		int[] numPecas = new int[2];
		double[] valorUnitario = new double[2];
		double[][] pecas = new double[2][3];
		double valorTotal = 0;
		
		for (int i = 0; i < pecas.length; i++) {
			codPeca[i] = sc.nextInt();
			numPecas[i] = sc.nextInt();
			valorUnitario[i] = sc.nextDouble();
			
			for (int j = 0; j < pecas[i].length; j++) {
				switch (j) {
				case 0:
					pecas[i][j] = codPeca[i];
					break;
					
				case 1:
					pecas[i][j] = numPecas[i];
					break;
					
				case 2:
					pecas[i][j] = valorUnitario[i];
					break;
				}
			}
		}
		
		for (int i = 0; i < pecas.length; i++) {
			valorTotal += pecas[i][1] * pecas[i][2];
		}
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		System.out.println();
		
		sc.close();

	}

}
