package teste_target_sistemas.questaoTres;

public class FaturamentoDiario {

	private int dia;
	private Double valor;
	
	
	public FaturamentoDiario() {
		
	}
	
	public FaturamentoDiario(int dia, Double valor) {
		super();
		this.dia = dia;
		this.valor = valor;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
}
