
public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception" + msg);
			ex.printStackTrace();

		}
		
		System.out.println("Finish");
		

	}

	public static void metodo1() {
		System.out.println("ini do metodo 1");
		metodo2();
		
		System.out.println("fim do metodo 1");
		
		
	}

	public static void metodo2() {
		System.out.println("Ini do metodo 2");
		
		 throw new ArithmeticException("deu errado");
		
		 
		 //System.out.println("Fim do metodo 2");

	}

	

}
