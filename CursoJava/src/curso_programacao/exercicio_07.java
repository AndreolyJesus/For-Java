package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {

	public static void main(String[] args) {
		// para ler varios dados na mesma linha.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;

		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();

		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
