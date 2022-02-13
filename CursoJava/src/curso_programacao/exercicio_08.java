package curso_programacao;

import java.util.Scanner;

public class exercicio_08 {

	public static void main(String[] args) {
		// entrada de dados, quebra de linha pendente.
		// solucao: fazer um nextLine() extra antes de fazer o nextLine() de seu
		// interesse.

		// Objeto: Scanner
		// next()
		// nextInt()
		// nextDouble()
		// next().charAt(0) ler caracter

		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine(); // solucao aqui.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
