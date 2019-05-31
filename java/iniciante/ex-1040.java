package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, n4, media, nExame, mediaFinal;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		
		media = ((n1*2) + (n2*3) + (n3*4) + (n4*1))/10;
		
		if(media >= 7.0) {
			
			System.out.printf("Media: %.1f\n", media);
			System.out.print("Aluno aprovado.\n");
			
		} else if(media >= 5.0 && media <= 6.9){
			
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno em exame.");
			
			nExame = sc.nextDouble();
			mediaFinal = (media+nExame)/2;
	
			System.out.printf("Nota do exame: %.1f\n", nExame);
			
			if(mediaFinal >= 5.0) {
				System.out.printf("Aluno aprovado.\n");
			} else {
				System.out.printf("Aluno reprovado.\n");
			}
			
			System.out.printf("Media final: %.1f\n", mediaFinal);
			
		} else if(media < 5.0) {
			System.out.printf("Media: %.1f\n", media);
			System.out.print("Aluno reprovado.\n");
		}
		
		sc.close();

	}

}
