package teste_target_sistemas.questaoQuatro;

public class Estado {

	private String nome;
	private Double faturamento;

	public Estado(String nome, Double faturamento) {
		this.nome = nome;
		this.faturamento = faturamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(Double faturamento) {
		this.faturamento = faturamento;
	}
	

}
