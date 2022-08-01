package teste_target_sistemas;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import teste_target_sistemas.questaoCinco.QuestaoCinco;
import teste_target_sistemas.questaoDois.QuestaoDois;
import teste_target_sistemas.questaoQuatro.Estado;
import teste_target_sistemas.questaoQuatro.QuestaoQuatro;
import teste_target_sistemas.questaoTres.QuestaoTres;

public class Main {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		System.out.println("-----Questão 2-----");
		QuestaoDois questaoDois = new QuestaoDois();
		int numeroFibo = 0;
        questaoDois.calcularFibonacci(numeroFibo);
        numeroFibo = 21;
        questaoDois.calcularFibonacci(numeroFibo);
        numeroFibo = 22;
        questaoDois.calcularFibonacci(numeroFibo);
        numeroFibo = 89;
        questaoDois.calcularFibonacci(numeroFibo);
        numeroFibo = 144;
        questaoDois.calcularFibonacci(numeroFibo);
        numeroFibo = 96;
        questaoDois.calcularFibonacci(numeroFibo);
        System.out.println("-------------------");
        
        System.out.println("-----Questão 3-----");
        QuestaoTres questaoTres = new QuestaoTres();
        questaoTres.menorFaturamento();
        questaoTres.maiorFaturamento();
        questaoTres.diasQueSuperaramAMedia();
        System.out.println("-------------------");
        
        System.out.println("-----Questão 4-----");
        QuestaoQuatro questaoQuatro = new QuestaoQuatro();
        Estado sp = new Estado("São Paulo", 67836.34);
    	Estado rj = new Estado("Rio De Janeiro", 36678.66);
    	Estado mg = new Estado("Minas Gerais", 29229.88);
    	Estado es = new Estado("Espírito Santo", 27165.48);
    	Estado outros = new Estado("Outros", 19849.53);
    	Double soma = sp.getFaturamento() + rj.getFaturamento() + mg.getFaturamento() + es.getFaturamento() + outros.getFaturamento();
        System.out.println("Faturamento total: RS " + soma);
    	questaoQuatro.calculoPercentualParticipacao(sp, soma);
        questaoQuatro.calculoPercentualParticipacao(rj, soma);
        questaoQuatro.calculoPercentualParticipacao(mg, soma);
        questaoQuatro.calculoPercentualParticipacao(es, soma);
        questaoQuatro.calculoPercentualParticipacao(outros, soma);
        System.out.println("-------------------");
        
        System.out.println("-----Questão 5-----");
        QuestaoCinco questaoCinco = new QuestaoCinco();
        String texto = "abcde";
        System.out.println("Texto original: " + texto);
        String resposta = questaoCinco.inverterString(texto);
        System.out.println("Texto invertido: " + resposta);
        System.out.println("-------------------");
        
	}
}


