
public class Main {
	
	public static void main(String[] args) {
		System.out.println("Começo");
		metodo1();
		System.out.println("Finish");
		
		
		
	}
	
	public static void metodo1() {
		System.out.println("1");
		metodo2();
		metodo3();
	}
	
	public static void metodo2() {
		System.out.println("2");
		
		try {
			
		}catch(ArithmeticException ex){
			String msg = ex.getMessage();
			System.out.println("ArithmeticException"+ msg);
			
		}
	}
	
	public static void metodo3() {
		for(int i=3;i<=5;i++) {
			System.out.println(i);
			int g=1/0;
			
			
		}
		
		
		
	}

}
