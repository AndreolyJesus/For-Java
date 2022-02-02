package curso_programacao;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		
		String nome ="Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%.4f%n", x);
		System.out.printf("%.2f%n", x);		
			// delimita casas decimais e ainda arredonda.
		Locale.setDefault(Locale.US);
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.print("Fala seu Mique...");
		System.out.println("  Bom dia !");
		
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda );
			// varios elementos concatenados em um mesmo comando de escrita.
	
	
	}	
	

}
