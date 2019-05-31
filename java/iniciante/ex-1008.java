package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nFuncionario, nHoras;
		double salarioHora, salario;
		
		nFuncionario = sc.nextInt();
		nHoras = sc.nextInt();
		salarioHora = sc.nextDouble();
		
		salario = nHoras * salarioHora;
		
		System.out.println("NUMBER = " + nFuncionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		System.out.println();
		
		sc.close();

	}

}
