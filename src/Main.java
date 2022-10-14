
public class Main {

	public static void main(String[] args) {
		System.out.println("Começo");
		try {
			metodo1();
		//abaixo exceptionm geral - pega qualquer exceção
		} catch (Exception ex) {
			String msg = ex.getMessage();
			System.out.println("ArithmeticException" + msg);

		}
		
		System.out.println("Finish");
		

	}

	public static void metodo1() {
		System.out.println("1");
		metodo2();
		metodo3();
	}

	public static void metodo2() {
		System.out.println("2");

	}

	public static void metodo3() {
		for (int i = 3; i <= 5; i++) {
			System.out.println(i);
			int g = 1 / 0;


		}

	}

}
