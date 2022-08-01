package teste_target_sistemas.questaoQuatro;

public class QuestaoQuatro {
	
	public QuestaoQuatro() {	
	}
	
	public void calculoPercentualParticipacao(Estado estado, Double soma){
		Double porcentagem = (estado.getFaturamento() / soma) * 100;
		System.out.printf("%s: %.2f %%\n", estado.getNome(), porcentagem);
	}
	
}
