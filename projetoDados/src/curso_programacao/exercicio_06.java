package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		// para ler um caractere.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next().charAt(0);
		System.out.println("voce digitou; " + x);
		
		sc.close();
		
		

	}

}
