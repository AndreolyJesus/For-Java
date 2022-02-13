package EstruturaCondicional;

import java.util.Scanner;

public class Switch_CaseTest {

	public static void main(String[] args) {
		
		// y = 0
		// y = 0 + 1 - > y = 1
		// y = 1 + 1 - > y = 2
		// y = 2 + 1 - > y = 3
		// y = 3 + 1 - > y = 4
		// y = 4 + 1 - > y = 5
		//
		
		int y = 0;
		
		while(y != 5) {
			System.out.println("Rodando o loop: " + y);
			y = y + 1;		
		}
		
		//System.out.println("Saindo do loop com valor de: " + y); 
		
		
		
		System.out.println("entre com um numero, e descubra o dia da semana. ");
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
