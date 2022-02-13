package EstruturaCondicional;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		// switch-case
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia = null;

		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
			default:
				dia = "invalido! ";
			break;
		}
		
		System.out.println("dia da semama: "+ dia);
		sc.close();

	}
}
