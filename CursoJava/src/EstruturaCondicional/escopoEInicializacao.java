package EstruturaCondicional;

public class escopoEInicializacao {

	public static void main(String[] args) {
		// de alguma forma a vareavel tem que ser iniciada

		double price = 400.00;
		
		double discount;
		
		if (price < 200.00) {
			discount = price * 0.1;
		}
		else {
			discount = 0;
		}
		System.out.println(discount);
	}

}
