package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite a temperatura em Celsius:");
		double C = sc.nextDouble();
		double F = 9.0 * C / 5.0 + 32.0;
		System.out.printf("Equivalente em Fahrenheit: %.1f%n",F);
		System.out.printf("Deseja repetir (s/n)?");
		char resp = sc.next().charAt(0);
		
		while (resp != 'n') {
			System.out.print("DIgite a temperatura em Celsius: ");
			C = sc.nextDouble();
			 F = 9.0 * C / 5.0 + 32.0;
			System.out.println("Equivalente em Fahrenheint: %.1f%n");
			System.out.println("Deseja repetir (s/n) ");
			 resp = sc.next().charAt(0);
		}
		

		sc.close();
	
	}
}
