package teste_target_sistemas.questaoTres;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class QuestaoTres {

	ObjectMapper objectMapper = new ObjectMapper();
	List<FaturamentoDiario> faturamentosDiarios;

	
	public QuestaoTres() throws JsonParseException, JsonMappingException, IOException {
		var x = this.getClass().getClassLoader().getResourceAsStream("dados.json");
		faturamentosDiarios = objectMapper.readValue(
				this.getClass().getClassLoader().getResourceAsStream("dados.json"), 
				new TypeReference<List<FaturamentoDiario>>() {
				});
	}
	
	public void menorFaturamento() {
		faturamentosDiarios.stream()
		.filter(d -> d.getValor() > 0)
		.min(Comparator.comparing(FaturamentoDiario::getValor))
		.ifPresentOrElse(fd ->{
			System.out.println("Dia com menor faturamento: " + fd.getDia()+ "; Valor faturado: RS " + fd.getValor());
		}, 
		()->{
			System.out.println("Nada encontrado.");
		});		
	}
	
	public void maiorFaturamento() {
		faturamentosDiarios.stream()
		.filter(d -> d.getValor() > 0)
		.max(Comparator.comparing(FaturamentoDiario::getValor))
		.ifPresentOrElse(fd ->{
			System.out.println("Dia com maior faturamento: " + fd.getDia() + "; Valor faturado: RS " + fd.getValor());
		}, 
		()->{
			System.out.println("Nada encontrado");
		});	
	}
	
	public void diasQueSuperaramAMedia() {
	  Double media = faturamentosDiarios.stream()
		.filter(d -> d.getValor() > 0)
		.mapToDouble(FaturamentoDiario::getValor)
		.average().orElse(0.0);
	  
	  Long quantidadeVezesMaiorDoQueAMedia = faturamentosDiarios.stream()
		.filter(d -> d.getValor() > media)
		.count();
	  
	  System.out.println("Quantidade de dias que o faturamento diario ultrapassou a média do mês: "
	  + quantidadeVezesMaiorDoQueAMedia);
	
	}
	
}
