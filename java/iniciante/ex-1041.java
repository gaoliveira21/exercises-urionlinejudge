package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float x, y;
		
		x = sc.nextFloat();
		y = sc.nextFloat();
		
		if(x == 0 && y == 0){
			System.out.printf("Origem\n");
		} else if(x == 0){
			System.out.printf("Eixo X\n");
		} else if(y == 0){
			System.out.printf("Eixo Y\n");
		} else if(x > 0 && y > 0){
			System.out.printf("Q1\n");
		} else if(x < 0 && y > 0){
			System.out.printf("Q2\n");
		} else if(x < 0 && y < 0){
			System.out.printf("Q3\n");
		} else if(x > 0 && y < 0){
			System.out.printf("Q4\n");
		}
		 
		sc.close();

	}

}
