package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int[] nums = {a, b, c};
		
		Arrays.sort(nums);
		
		System.out.printf(nums[2] + " eh o maior");
		System.out.println();
		
		sc.close();

	}

}
