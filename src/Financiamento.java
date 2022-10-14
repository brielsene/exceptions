
public class Financiamento {
	public double valorTotal, entrada;
	public int parcelas;
	
	public Financiamento(double valorTotal, double entrada, int parcelas) {
		if(entrada < valorTotal *0.2) {
			throw new RuntimeException("o valor minímo de entrada é 20%");
		}else if(parcelas<6){
			throw new RuntimeException("O número mínimo de entradas é 6");
		}
		
		this.valorTotal = valorTotal;
		this.entrada = entrada;
		this.parcelas = parcelas;
	}
	
	public double prestacao() {
		return (valorTotal - entrada)/parcelas;
	}

}
